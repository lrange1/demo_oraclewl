package com.demosophos.deploy.api;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demosophos")
public class RestDemoApiCtrl {

	@Value("${deployed.env}")
	private String sEnv;
	
	@GetMapping(value = "/health")
	public ResponseEntity<String> healthCheck(){
		return new ResponseEntity<>(Calendar.getInstance().getTime().toString() + " Hello from " + sEnv, HttpStatus.ACCEPTED);		
	}
}
