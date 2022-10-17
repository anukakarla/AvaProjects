package com.col.filterassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.col.filterassignment.model.Country;
import com.col.filterassignment.service.CountryServiceImp;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class CountryController {
	@Autowired
	private CountryServiceImp countryServiceImp;
	
	@Autowired
	private RestTemplate restTemplate;

	private String url = "https://restcountries.com/v3/all";

	@GetMapping("/getData")
	public ResponseEntity<Country[]> getData() {

		return ResponseEntity.status(HttpStatus.OK).body(countryServiceImp.getAll(url));

	}
	@GetMapping("/filter")
	public MappingJacksonValue filterData() {
		Country[] countries = countryServiceImp.getAll(url);
		SimpleBeanPropertyFilter beanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("name", "currencies",
				"capital","nativeName");
		FilterProvider filterProvider = new SimpleFilterProvider().addFilter("getCountry", beanPropertyFilter);
		MappingJacksonValue jacksonValue = new MappingJacksonValue(countries);
		jacksonValue.setFilters(filterProvider);
		return jacksonValue;
	}
	
	

}
