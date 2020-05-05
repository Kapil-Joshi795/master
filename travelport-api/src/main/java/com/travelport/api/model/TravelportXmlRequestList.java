package com.travelport.api.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class TravelportXmlRequestList {

	@JacksonXmlProperty(localName = "Flights")
    @JacksonXmlElementWrapper(useWrapping = false)
	private List<TravelportXmlRequest> flightList;

	public TravelportXmlRequestList() {
		super();
	}
	
	public List<TravelportXmlRequest> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<TravelportXmlRequest> flightList) {
		this.flightList = flightList;
	}
}
