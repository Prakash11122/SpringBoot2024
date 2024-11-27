package com.it.pradhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	//@RequestMapping(value="/Home",method = RequestMethod.GET)
	@GetMapping("/home")
	public String showHomePage() {
		return "UserHome";
	}

}
