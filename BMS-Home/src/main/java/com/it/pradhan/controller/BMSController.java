package com.it.pradhan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.pradhan.service.IBMSService;

@RestController
@RequestMapping("/bms/api")
public class BMSController {
	
	private IBMSService iBMSService;

	  public BMSController(IBMSService  iBMSService) {
	    this.iBMSService = iBMSService;
	  }

}
