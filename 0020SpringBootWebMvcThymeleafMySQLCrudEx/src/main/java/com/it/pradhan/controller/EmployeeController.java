package com.it.pradhan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.it.pradhan.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;
	
	
	
	/***
	 * 1. SHOW REGISTER PAGE
	 * This method is used to display Register Page
	 * when end-user enters /register with GET Type
	 */
	
	@GetMapping("/empdata")
	public String showRegPage() {
		return"EmployeeRegister";
	}


}
