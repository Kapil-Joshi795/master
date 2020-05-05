package com.travelport.api.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.travelport.api.model.TravelportRequest;

public interface TravelPortService {
	
	public ResponseEntity<TravelportRequest[]> checkflights();
	
	public List<TravelportRequest> bookflights();
	
	public List<TravelportRequest> getflightBooked();
	
	public List<TravelportRequest> cancelflight();
}
