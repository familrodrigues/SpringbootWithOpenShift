package com.example.demoOpenshift.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoOpenshiftController {

	@GetMapping("/testApi")
	public void invokeAPI() {
		System.out.println("Hello World");
		
	}

}
