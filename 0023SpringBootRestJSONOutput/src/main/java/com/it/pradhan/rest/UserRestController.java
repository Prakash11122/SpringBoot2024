package com.it.pradhan.rest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.pradhan.Role;
import com.it.pradhan.entity.User;

@RestController
@RequestMapping("/user")
public class UserRestController {
	@GetMapping("/getone")
	public ResponseEntity<User> getOneObj(){
		User ob = new  User(10, "rakesh", "officer");
		ResponseEntity<User> responce = new ResponseEntity<User>(ob,HttpStatus.OK);
		return responce;
	}
	
	
	@GetMapping("/getdata")
	public ResponseEntity<List<Role>>getAllRoles(){
		List<Role> roles = Arrays.asList(
				new Role(1100, "ADMIN"),
				new Role(1102, "BA"),
				new Role(1103, "QA")
			);
		ResponseEntity<List<Role>> responce = new ResponseEntity<>(roles,HttpStatus.OK);
		return responce;
		
	}
	
	
	@GetMapping("/map")
	public ResponseEntity<Map<String, Role>>getAlldata(){
		Map<String,Role> rolesMap = Map.of(
				"R1", new Role(1100, "ADMIN"),
				"R2", new Role(1102, "BA"),
				"R3", new Role(1103, "QA")
			);
		ResponseEntity<Map<String,Role>> responce = new ResponseEntity<>(rolesMap,HttpStatus.OK);
		return responce;
	}
	
	

}
