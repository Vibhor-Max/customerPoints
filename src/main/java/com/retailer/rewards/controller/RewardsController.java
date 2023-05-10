package com.retailer.points.controller;
import com.retailer.points.entity.Customer;
import com.retailer.points.model.Points;
import com.retailer.points.repository.customerPointsRepository;
import com.retailer.points.service.customerPointsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/customerPoints")
public class pointsController {

    @Autowired
    customerPointsService customerPointsService;

    @Autowired
    customerPointsRepository customerRepository;

    @GetMapping(value = "/{custId}/points",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Points> getPointsBycustId(@PathVariable("custId") Long custId){
        Customer customer = customerRepository.findBycustId(custId);
        if(customer == null)
        {
        	throw new RuntimeException("custId is Required");
        }
        Points customerPoints = customerPointsService.getPointsBycustId(custId);
        return new ResponseEntity<>(customerPoints,HttpStatus.OK);
    }

}
