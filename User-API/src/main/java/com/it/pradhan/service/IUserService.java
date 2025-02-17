package com.it.pradhan.service;

import java.util.List;

import com.it.pradhan.dto.UserDTO;


public interface IUserService {
	
	String createUser(UserDTO userDto);
	List<UserDTO > getAllUser();
	UserDTO getUserById(Integer userId);
	void deleteUserById(Integer userId);
	void updateUserById(Integer userId,UserDTO userDto);

}
