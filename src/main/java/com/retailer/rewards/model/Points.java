package com.retailer.points.model;

public class Points {
    private long custId;
	private long lastMonthCustomerPoints;
    private long lastSecondMonthCustomerPoints;
    private long lastThirdMonthCustomerPoints;
    private long totalCustomerPoints;

    public long getcustId() {
        return custId;
    }

    public long getLastMonthCustomerPoints() {
		return lastMonthCustomerPoints;
	}

	public void setLastMonthpoints(long lastMonthCustomerPoints) {
		this.lastMonthCustomerPoints = lastMonthCustomerPoints;
	}

	public long lastSecondMonthCustomerPoints() {
		return lastSecondMonthCustomerPoints;
	}

	public void setLastSecondMonthCustomerPoints(long lastSecondMonthCustomerPoints) {
		this.lastSecondMonthCustomerPoints = lastSecondMonthCustomerPoints;
	}

	public long getLastThirdMonthCustomerPoints() {
		return lastThirdMonthCustomerPoints;
	}

	public void setLastThirdMonthCustomerPoints(long lastThirdMonthCustomerPoints) {
		this.lastThirdMonthCustomerPoints = lastThirdMonthCustomerPoints;
	}

	public void setcustId(long custId) {
        this.custId = custId;
    }

    
    public long getTotalCustomerPoints() {
        return totalCustomerPoints;
    }

    public void setTotalCustomerPoints(long totalCustomerPoints) {
        this.totalCustomerPoints = totalCustomerPoints;
    }
}
