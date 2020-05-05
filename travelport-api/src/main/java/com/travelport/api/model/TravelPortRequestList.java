package com.travelport.api.model;

import java.util.ArrayList;
import java.util.List;

public class TravelPortRequestList {
	
	private List<TravelportRequest> flight;
	
	public TravelPortRequestList() {
		this.flight = new ArrayList();
	}

	public List<TravelportRequest> getFlightList() {
		return flight;
	}

	public void setFlightList(List<TravelportRequest> flight) {
		this.flight = flight;
	}
	
}
