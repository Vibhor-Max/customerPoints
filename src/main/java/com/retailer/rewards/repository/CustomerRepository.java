package com.retailer.points.repository;
import org.springframework.data.repository.CrudRepository;
import com.retailer.points.entity.Customer;

public interface customerPointsRepository extends CrudRepository<Customer,Long> {
    public Customer findBycustId(Long custId);
}
