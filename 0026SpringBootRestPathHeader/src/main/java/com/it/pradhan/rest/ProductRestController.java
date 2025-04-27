package com.it.pradhan.rest;

import java.util.Enumeration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	@PostMapping("/details")
	public ResponseEntity<String>showHeaders(
			@RequestHeader ("Content-Type")String type,
			@RequestHeader("Content-Length")String len,
			@RequestHeader("Authorization")String auth,
			HttpServletRequest req
			)
	{
		System.out.println(auth);
		Enumeration<String> headerNames = req.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String hdr = headerNames.nextElement();
			System.out.println(hdr + " " + req.getHeader(hdr));
		}
		System.out.println("Data " + type +" - "+ len);
		return new ResponseEntity<>("CHECK",HttpStatus.OK);
		
	}
}

