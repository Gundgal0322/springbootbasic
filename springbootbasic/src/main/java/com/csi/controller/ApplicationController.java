package com.csi.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {
	
	@GetMapping
	public String helloWorld() {
		return "Welcome to Fintech CSI";
	}
	
	@GetMapping("/services")
	public String services() {
		return "Fintech Credit System ";		
	}

	@GetMapping("/address")
	public String address() {
		return "PUNE | MH | INDIA";
	}
	
	@GetMapping("/listOfEmployee")
	public List<Employee> getAllData() {
		
		return Stream.of(new Employee(121,"Tejas"), new Employee(122, "Rohit")).collect
				(Collectors.toList());
		
		
	}
}
