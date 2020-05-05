package com.travelport.api.model;



import java.sql.Date;
import java.sql.Time;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="Flights")
public class TravelportXmlRequest {
	
	@JacksonXmlProperty(isAttribute = true)
	private String flightId;
	@JacksonXmlProperty
	private String flightName;
	@JacksonXmlProperty
	private String departure;
	@JacksonXmlProperty
	private String arrival;
	@JacksonXmlProperty
	private Date departureDate;
	@JacksonXmlProperty
	private Time departureTime;
	@JacksonXmlProperty
	private Date arrivalDate;
	@JacksonXmlProperty
	private Time arrivalTime;
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	@JacksonXmlProperty
	private Long seatsAvl;
	
	public TravelportXmlRequest() {
		super();
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Long getSeatsAvl() {
		return seatsAvl;
	}

	public void setSeatsAvl(Long seatsAvl) {
		this.seatsAvl = seatsAvl;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
}
