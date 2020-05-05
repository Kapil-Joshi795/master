package com.travelport.api.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class TravelportXmlResponseList {

	@JacksonXmlProperty(localName = "Flights")
    @JacksonXmlElementWrapper(useWrapping = false)
	private List<TravelportXmlResponse> flightList;

	public TravelportXmlResponseList() {
		super();
	}

	public List<TravelportXmlResponse> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<TravelportXmlResponse> flightList) {
		this.flightList = flightList;
	}	
}
