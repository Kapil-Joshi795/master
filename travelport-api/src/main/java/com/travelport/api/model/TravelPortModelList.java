package com.travelport.api.model;

import java.util.ArrayList;
import java.util.List;

public class TravelPortModelList {
	
	private List<TravelportModel> flightList;
	

	public TravelPortModelList() {
		this.flightList = new ArrayList();
	}

	public List<TravelportModel> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<TravelportModel> flightList) {
		this.flightList = flightList;
	}
	
}
