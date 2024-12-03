package com.it.pradhan.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@GetMapping("/getproduct")
	public ResponseEntity<String> getProduct() {
		ResponseEntity<String> reponse = new ResponseEntity<String>("From get product methos", HttpStatus.OK);
		return reponse;
	}
	
	@PostMapping("/create")
	public ResponseEntity<String>createProduct(){
		ResponseEntity<String> response = new ResponseEntity<String>("From post method", HttpStatus.OK);
		return response;
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<String>updateProduct(){
		ResponseEntity<String> response = new ResponseEntity<String>("From put method", HttpStatus.OK);
		return response;
	}

	
	@DeleteMapping("/delete")
	public ResponseEntity<String>deleteProduct(){
		ResponseEntity<String> response = new ResponseEntity<String>("From delete method", HttpStatus.OK);
		return response;
	}

	
	@PatchMapping("/patch")
	public ResponseEntity<String>modifyProductCost(){
		ResponseEntity<String> response = new ResponseEntity<String>("From patch method", HttpStatus.OK);
		return response;
	}


}
