package com.it.pradhan.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/getstudent")
	public ResponseEntity<String> getStudent(){
		ResponseEntity<String> respose = new ResponseEntity<String>("From getStudent method", HttpStatus.OK);
		return respose;
	}
	
	
	@PatchMapping("/save")
	public ResponseEntity<String> saveStudent(){
		ResponseEntity<String> respose = new ResponseEntity<String>("From save method", HttpStatus.OK);
		return respose;
	}

	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deletStudent(){
		ResponseEntity<String> respose = new ResponseEntity<String>("From delete method", HttpStatus.OK);
		return respose;
	}


}
