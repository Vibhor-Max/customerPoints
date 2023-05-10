package com.retailer.points.service;
import com.retailer.points.model.Points;

public interface customerPointsService {
    public Points getPointsBycustId(Long custId);
}
