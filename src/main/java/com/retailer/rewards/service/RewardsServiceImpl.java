package com.retailer.points.service;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.retailer.points.constants.Constants;
import com.retailer.points.entity.Transaction;
import com.retailer.points.model.Points;
import com.retailer.points.repository.TransactionRepository;

@Service
public class customerPointsServiceImpl implements customerPointsService {

	
	@Autowired
	TransactionRepository transactionRepository;

	public Points getPointsBycustId(Long custId) {

		Timestamp lastMonthTimestamp = getDateBasedOnOffSetDays(Constants.daysInMonths);
		Timestamp lastSecondMonthTimestamp = getDateBasedOnOffSetDays(2*Constants.daysInMonths);
		Timestamp lastThirdMonthTimestamp = getDateBasedOnOffSetDays(3*Constants.daysInMonths);

		List<Transaction> lastMonthTransactions = transactionRepository.findAllBycustIdAndTransaDate(
				custId, lastMonthTimestamp, Timestamp.from(Instant.now()));
		List<Transaction> lastSecondMonthTransactions = transactionRepository
				.findAllBycustIdAndTransaDate(custId, lastSecondMonthTimestamp, lastMonthTimestamp);
		List<Transaction> lastThirdMonthTransactions = transactionRepository
				.findAllBycustIdAndTransaDate(custId, lastThirdMonthTimestamp,
						lastSecondMonthTimestamp);

		Long lastMonthCustomerPoints = getpointsPerMonth(lastMonthTransactions);
		Long lastSecondMonthCustomerPoints = getpointsPerMonth(lastSecondMonthTransactions);
		Long lastThirdMonthCustomerPoints = getpointsPerMonth(lastThirdMonthTransactions);

		Points customerPoints = new Points();
		customerPoints.setcustId(custId);
		customerPoints.setLastMonthpoints(lastMonthCustomerPoints);
		customerPoints.setLastSecondMonthCustomerPoints(lastSecondMonthCustomerPoints);
		customerPoints.setLastThirdMonthCustomerPoints(lastThirdMonthCustomerPoints);
		customerPoints.setTotalCustomerPoints(lastMonthCustomerPoints + lastSecondMonthCustomerPoints + lastThirdMonthCustomerPoints);

		return customerPoints;

	}

	private Long getpointsPerMonth(List<Transaction> transactions) {
		return transactions.stream().map(transaction -> calculatepoints(transaction))
				.collect(Collectors.summingLong(r -> r.longValue()));
	}

	private Long calculatepoints(Transaction t) {
		if (t.getTranAmt() > Constants.firstpointLimit && t.getTranAmt() <= Constants.secondpointLimit) {
			return Math.round(t.getTranAmt() - Constants.firstpointLimit);
		} else if (t.getTranAmt() > Constants.secondpointLimit) {
			return Math.round(t.getTranAmt() - Constants.secondpointLimit) * 2
					+ (Constants.secondpointLimit - Constants.firstpointLimit);
		} else
			return 0l;

	}

	public Timestamp getDateBasedOnOffSetDays(int days) {
		return Timestamp.valueOf(LocalDateTime.now().minusDays(days));
	}

}
