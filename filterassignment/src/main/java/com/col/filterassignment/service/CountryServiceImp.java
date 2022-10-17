package com.col.filterassignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.col.filterassignment.model.Country;

@Service
public class CountryServiceImp implements CountryService{
	@Autowired
	private RestTemplate restTemplate;
	private HttpEntity<String> getHeaderEntity() {

		org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
		headers.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		return entity;
	}

	@Override
	public Country[] getAll(String url) {
		try {
			ResponseEntity<Country[]> result = restTemplate.exchange(url, HttpMethod.GET, getHeaderEntity(),
					Country[].class);
			
			return result.getBody();
		} catch (RestClientException e) {
			e.printStackTrace();
			return null;
		}
	}

}
