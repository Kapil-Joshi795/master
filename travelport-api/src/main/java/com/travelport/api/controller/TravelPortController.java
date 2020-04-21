package com.travelport.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.travelport.api.model.TravelportModel;

@RestController
@RequestMapping("/travelport")
public class TravelPortController {
	
	@Value("${checkflights.url}")
	private String url;
	
	@Autowired
	RestTemplate restTemplate = new RestTemplate();

	@GetMapping("/getflights")
	public TravelportModel[] checkflights()
	{
		TravelportModel[] tpmList = restTemplate.getForObject(url, TravelportModel[].class);
		return tpmList;
	}
}
