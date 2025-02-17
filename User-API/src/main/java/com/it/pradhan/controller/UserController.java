package com.it.pradhan.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.pradhan.dto.UserDTO;
import com.it.pradhan.service.IUserService;

@RestController
@RequestMapping("/user/api")
public class UserController {
	
	private IUserService iUserService;

	  public UserController(IUserService iUserService) {
	    this.iUserService = iUserService;
	  }



	@PostMapping
	public String createUser(@RequestBody UserDTO userDTO) {
		String isUserCreated="";
		try {
			isUserCreated= iUserService.createUser(userDTO);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return isUserCreated;
	}
	
	@GetMapping("user")
	  public List<UserDTO> getAllUsers() {
	    List<UserDTO> users = null;
	    try {
	      users = iUserService.getAllUser();
	    } catch (Exception e) {
	      //
	    }
	    return users;
	  }
	
	@GetMapping("user/{userID}")
	  public UserDTO getUserByID(@PathVariable Integer userID) {
	    if(userID!=null) {
	      try {
	        return iUserService.getUserById(userID);
	      } catch (Exception e) {
	        //
	      }
	    }
	    return null;
	  }

}
