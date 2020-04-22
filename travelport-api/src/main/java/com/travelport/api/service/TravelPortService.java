package com.travelport.api.service;

import java.util.List;

import com.travelport.api.model.TravelportModel;

public interface TravelPortService {
	
	public List<TravelportModel> checkflights();
	
	public List<TravelportModel> bookflights();
	
	public List<TravelportModel> getflightBooked();
	
	public List<TravelportModel> cancelflight();
}
