package com.flights.api.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class FlightsList {
	
	@JacksonXmlProperty(localName = "Flights")
    @JacksonXmlElementWrapper(useWrapping = false)
	private List<Flights> flightList;

	public FlightsList() {
		this.flightList = new ArrayList();
	}

	public List<Flights> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<Flights> flightList) {
		this.flightList = flightList;
	}
	
}
