package com.travelport.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.travelport.api.mapper.TravelportMapper;
import com.travelport.api.model.TravelPortRequestList;
import com.travelport.api.model.TravelportRequest;
import com.travelport.api.model.TravelportResponseList;
import com.travelport.api.model.TravelportXmlRequestList;
import com.travelport.api.model.TravelportXmlResponseList;
import com.travelport.api.service.TravelPortService;

@RestController
@RequestMapping("/travelport")
public class TravelPortController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	TravelPortService service;
	
	@Autowired
	TravelportMapper mapper;
	
	@Value("${add_flights_details.url}")
	private String add_flights_detailsURL;
	
	@Value("${delete_flights_details.url}")
	private String delete_flights_detailsURL;
	
	@Value("${get_hotel_Details.url}")
	private String get_hotel_DetailsURL;

	@PostMapping(value="/conversionJSON_To_XML", consumes=MediaType.APPLICATION_JSON_VALUE ,produces=MediaType.APPLICATION_XML_VALUE)
	public TravelportXmlRequestList conversionJSON_To_XML(@RequestBody TravelPortRequestList flightsList)
	{
		return mapper.convertJSON_to_XML(flightsList);
	}

	@PostMapping(value="/conversionXML_TO_JSON", consumes=MediaType.APPLICATION_XML_VALUE ,produces= MediaType.APPLICATION_JSON_VALUE)
	public TravelportResponseList conversionXML_TO_JSON(@RequestBody TravelportXmlResponseList flightsList)
	{
		return mapper.convertXML_to_JSON(flightsList);
	}
	
	@PostMapping(value="/add_flights_details", consumes=MediaType.APPLICATION_JSON_VALUE ,produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TravelportResponseList> addFlightsDetails(@RequestBody TravelPortRequestList flight)
	{
		TravelportXmlRequestList xml_request = conversionJSON_To_XML(flight);
		System.out.println("Request in xml from" + xml_request.toString());
		TravelportXmlResponseList xml_response = restTemplate.postForEntity(add_flights_detailsURL, xml_request, TravelportXmlResponseList.class).getBody();
		System.out.println("Response in xml from" + xml_response.toString());
		return new ResponseEntity<TravelportResponseList>(conversionXML_TO_JSON(xml_response), HttpStatus.OK);
	}
	
	
	
	
	
	
	
	@GetMapping(value="/getflights", produces= MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<TravelportRequest[]> checkflights()
	{
		return service.checkflights();
	}
		
	@DeleteMapping(value="/cancelflight",produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> cancelflight(@RequestParam  Long flightId)
	{
		restTemplate.delete(delete_flights_detailsURL);
		String response = flightId +" Successfully Cancelled";
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}
