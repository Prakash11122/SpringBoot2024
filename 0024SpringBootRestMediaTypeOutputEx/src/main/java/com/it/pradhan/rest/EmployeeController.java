package com.it.pradhan.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.pradhan.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@PostMapping("/create")
	public ResponseEntity<String> createEmployee(@RequestBody Employee employee)
	{
		String s = employee.toString();
		ResponseEntity<String> response = new ResponseEntity<String>(s,HttpStatus.OK);
		return response;

	}

}
