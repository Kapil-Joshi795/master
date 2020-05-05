package com.travelport.api.model;

import java.util.List;

public class TravelportResponseList {

	private List<TravelportResponse> flight;
	
	public TravelportResponseList() {
		super();
	}

	public List<TravelportResponse> getFlightList() {
		return flight;
	}

	public void setFlightList(List<TravelportResponse> flight) {
		this.flight = flight;
	}
}
