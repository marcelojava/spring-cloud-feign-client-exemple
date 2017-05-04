package com.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.client.gateway.GreatingGateway;

@RestController
public class GreatingController {

	@Autowired
	private GreatingGateway greatingGateway;
	
	@RequestMapping(name="greating-client", method = RequestMethod.GET)
	public ResponseEntity<String> greatings() {
		return new ResponseEntity<>(this.greatingGateway.greating(), HttpStatus.OK);
	}
}
