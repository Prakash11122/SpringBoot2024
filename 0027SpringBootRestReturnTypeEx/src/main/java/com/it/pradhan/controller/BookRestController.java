package com.it.pradhan.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.pradhan.entity.Book;

@RestController
@RequestMapping("/book")
public class BookRestController {

	@GetMapping("/a")
	public String justBody() {
		return "Hello book  data";
	}

	@GetMapping("/b")
	public Book justBook() {
		return new Book(10, "AA", 200.0);
	}

	@GetMapping("/data")
	public ResponseEntity<String> showInfo() {
		// 1. passing Http Status
		// ResponseEntity<String> response = new ResponseEntity<>(HttpStatus.OK);

		// 2. passing Body + Http Status
		// String body = "WELCOME TO APP";
		// ResponseEntity<String> response = new ResponseEntity<>(body, HttpStatus.OK);

		// 3. Passing headers + status
		HttpHeaders headers = new HttpHeaders();
		headers.add("MyAppOne", "ACTIVATED-CLIENT");
		// ResponseEntity<String> response = new ResponseEntity<>(headers,
		// HttpStatus.OK);

		// 4. Passing body + headers + status
		String body = "WELCOME TO APP";
		ResponseEntity<String> response = new ResponseEntity<>(body, headers, HttpStatus.OK);

		return response;
	}
}
