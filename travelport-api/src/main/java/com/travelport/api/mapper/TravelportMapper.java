package com.travelport.api.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.travelport.api.model.TravelPortRequestList;
import com.travelport.api.model.TravelportRequest;
import com.travelport.api.model.TravelportResponse;
import com.travelport.api.model.TravelportResponseList;
import com.travelport.api.model.TravelportXmlRequest;
import com.travelport.api.model.TravelportXmlRequestList;
import com.travelport.api.model.TravelportXmlResponse;
import com.travelport.api.model.TravelportXmlResponseList;

@Component
public class TravelportMapper {

	public TravelportXmlRequestList convertJSON_to_XML(TravelPortRequestList flightsList)
	{
		TravelportXmlRequestList list = new TravelportXmlRequestList();
		List<TravelportXmlRequest> responseList = new ArrayList();
		for(TravelportRequest request : flightsList.getFlightList())
		{
			TravelportXmlRequest response = new TravelportXmlRequest();
			response.setArrival(request.getArrival());
			response.setArrivalDate(request.getArrivalDate());
			response.setArrivalTime(request.getArrivalTime());
			response.setDeparture(request.getDeparture());
			response.setDepartureDate(request.getDepartureDate());
			response.setDepartureTime(request.getDepartureTime());
			response.setFlightId(request.getFlightId());
			response.setFlightName(request.getFlightName());
			response.setSeatsAvl(request.getSeatsAvl());
			responseList.add(response);
		}
		list.setFlightList(responseList);
		return list;
	}
	
	public TravelportResponseList convertXML_to_JSON(TravelportXmlResponseList flightsList)
	{
		TravelportResponseList list = new TravelportResponseList();
		List<TravelportResponse> responseList = new ArrayList();
		for(TravelportXmlResponse request : flightsList.getFlightList())
		{
			TravelportResponse response = new TravelportResponse();
			response.setArrival(request.getArrival());
			response.setArrivalDate(request.getArrivalDate());
			response.setArrivalTime(request.getArrivalTime());
			response.setDeparture(request.getDeparture());
			response.setDepartureDate(request.getDepartureDate());
			response.setDepartureTime(request.getDepartureTime());
			response.setFlightId(request.getFlightId());
			response.setFlightName(request.getFlightName());
			response.setSeatsAvl(request.getSeatsAvl());
			responseList.add(response);
		}
		list.setFlightList(responseList);
		return list;
	}
}
