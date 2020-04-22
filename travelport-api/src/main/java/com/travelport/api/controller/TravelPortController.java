package com.travelport.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.travelport.api.model.TravelportModel;
import com.travelport.api.service.TravelPortService;

@RestController
@RequestMapping("/travelport")
public class TravelPortController {
	
	@Value("${checkflights.url}")
	private String url;
	
	@Autowired
	RestTemplate restTemplate = new RestTemplate();
	
	@Autowired
	TravelPortService service;

	@GetMapping("/getflights")
	public ResponseEntity<TravelportModel[]> checkflights()
	{
		TravelportModel[] tpmList = restTemplate.getForObject(url, TravelportModel[].class);
		return new ResponseEntity<TravelportModel[]>(tpmList, HttpStatus.OK);
	}
	
	@PostMapping("/bookflight")
	public TravelportModel[] bookflights()
	{
		TravelportModel[] tpmList = restTemplate.getForObject(url, TravelportModel[].class);
		return tpmList;
	}
	
	@GetMapping("/getBookedFlightDetails")
	public TravelportModel[] getflightBooked()
	{
		TravelportModel[] tpmList = restTemplate.getForObject(url, TravelportModel[].class);
		return tpmList;
	}
	
	@DeleteMapping("/cancelflight")
	public TravelportModel[] cancelflight()
	{
		TravelportModel[] tpmList = restTemplate.getForObject(url, TravelportModel[].class);
		return tpmList;
	}
}
