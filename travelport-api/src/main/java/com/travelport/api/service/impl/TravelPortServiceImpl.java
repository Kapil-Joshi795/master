package com.travelport.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.travelport.api.exception.RecordNotFoundException;
import com.travelport.api.model.TravelportRequest;
import com.travelport.api.service.TravelPortService;

@Service
public class TravelPortServiceImpl implements TravelPortService{

	@Value("${checkflights.url}")
	private String checkflightsURL;
	
	@Value("${bookticket.url}")
	private String bookticketURL;
	
	@Autowired
	RestTemplate restTemplate = new RestTemplate();

	public ResponseEntity<TravelportRequest[]> checkflights() {
		TravelportRequest[] tpmList = restTemplate.getForObject(checkflightsURL, TravelportRequest[].class);
		if(tpmList.length<1) throw new RecordNotFoundException("No Flight Available");
		return new ResponseEntity<TravelportRequest[]>(tpmList, HttpStatus.OK);
	}

	public List<TravelportRequest> bookflights() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TravelportRequest> getflightBooked() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TravelportRequest> cancelflight() {
		// TODO Auto-generated method stub
		return null;
	}

}
