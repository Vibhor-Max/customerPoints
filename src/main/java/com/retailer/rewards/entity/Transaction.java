package com.retailer.points.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACTION")
public class Transaction {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "tran_id")
    private Long tranId;

    @Column(name="cust_id")
    private Long custId;

    @Column(name = "tran_date")
    private Timestamp tranDate;

    @Column(name = "amt")
    private double tranAmt;


    public Long getTranId() {
		return tranId;
	}

	public void setTranId(Long tranId) {
		this.tranId = tranId;
	}

	public Long getcustId() {
        return custId;
    }

    public void setcustId(Long custId) {
        this.custId = custId;
    }

    public Timestamp getTranDate() {
        return tranDate;
    }

    public void setTransactionDate(Timestamp tranDate) {
        this.tranDate = tranDate;
    }

    public double getTranAmt() {
        return tranAmt;
    }

    public void setTransactionAmount(double tranAmt) {
        this.tranAmt = tranAmt;
    }
}
