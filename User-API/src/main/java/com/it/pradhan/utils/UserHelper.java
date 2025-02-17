package com.it.pradhan.utils;

import com.it.pradhan.dto.UserDTO;
import com.it.pradhan.entity.User;

public class UserHelper {
	
	public static User convertUserDTOToUser(UserDTO userDTO) {
		
		User user = new User();
		user.setAadharID(userDTO.getAadharID());
		user.setUserName(userDTO.getUserName());
		user.setPanID(userDTO.getPanID());
		return user;
	}
	public static User convertUserToUserDTO(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setAadharID(user.getAadharID());
		userDTO.setUserName(user.getUserName());
		userDTO.setPanID(user.getPanID());
		userDTO.setUserId(user.getUserId());
		return user;
	}
	
	

}
