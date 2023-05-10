package com.retailer.points.repository;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.retailer.points.entity.Transaction;

@Repository
@Transactional
public interface TransactionRepository extends CrudRepository<Transaction,Long> {
    public List<Transaction> findAllBycustId(Long custId);

    public List<Transaction> findAllBycustIdAndTransaDate(Long custId, Timestamp from,Timestamp to);
}
