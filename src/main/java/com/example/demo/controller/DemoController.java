package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	
	@GetMapping("/welcome/{name}")
	public ResponseEntity<String> welcome(@PathVariable String name){
		
		String str = "Welcome to my first CI/CD: " + name;
		
		return new ResponseEntity<>(str, HttpStatus.OK);
		
	}
	
	@GetMapping("/add/{num1}/{num2}")
	public ResponseEntity<String> add(@PathVariable int num1,@PathVariable int num2){
		
		int add = num1 + num2;
		String str = "Sum of num1 and num2: " + add;
		
		return new ResponseEntity<>(str, HttpStatus.OK);
		
	}
	
	@GetMapping("/substract/{num1}/{num2}")
	public ResponseEntity<String> substract(@PathVariable int num1,@PathVariable int num2){
		
		int add = num1 - num2;
		String str = "Sum of num1 and num2: " + add;
		
		return new ResponseEntity<>(str, HttpStatus.OK);
		
	}
	
	
	
}
