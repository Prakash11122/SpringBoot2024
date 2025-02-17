package com.it.pradhan.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.pradhan.dto.UserDTO;
import com.it.pradhan.entity.User;
import com.it.pradhan.repository.UserRepository;
import com.it.pradhan.utils.UserHelper;
import com.it.pradhan.validation.UserValidation;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserRepository userRepository;
	@Override
	  public String createUser(UserDTO userDTO) {

	    User user = UserHelper.convertUserDTOToUser(userDTO);
	    boolean isUserExist = userRepository.existsByAadharID(user.getAadharID());
	    if (isUserExist) {
	      throw new IllegalArgumentException("User Alreday Exist");
	    } 
	    if(!UserValidation.isValidName(user.getUserName())) {
	      throw new IllegalArgumentException("There are no Users");
	    }
	    
	    if(!UserValidation.isAadharValid(user.getAadharID())) {
	      throw new IllegalArgumentException("Invalid Aadhar");
	    }
	    
	    if(!UserValidation.isPanValid(user.getPanID())) {
	      throw new IllegalArgumentException("Invalid PAN");
	    }
	    
	    String capitalFirstLetter = 
	        UserValidation.capitalFirstLetter(user.getUserName());
	    user.setUserName(capitalFirstLetter);
	    userRepository.save(user);
	    return "User Created";

	  }

	@Override
	public List<UserDTO> getAllUser() {
		List<User> users = userRepository.findAll();
		if(users.isEmpty()) {
			throw new IllegalArgumentException("There is no user");
		}
		List<UserDTO> userList = new ArrayList<>();
	    for (User user : users) {
	      UserDTO userDTO = new UserDTO();
	      BeanUtils.copyProperties(user, userDTO);
	      userList.add(userDTO);
	    }
		return userList;
	}

	@Override
	public UserDTO getUserById(Integer userId) {
		Optional<User> user = 
		        userRepository.findById(userId);
		     User userData = user.orElseThrow(() -> 
		         new IllegalArgumentException("User with ID " + userId + " not found")
		     );
		     UserDTO userDTO = new UserDTO();
		     BeanUtils.copyProperties(userData, userDTO);
		return null;
	}

	@Override
	public void deleteUserById(Integer userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUserById(Integer userId, UserDTO userDto) {
		// TODO Auto-generated method stub
		
	}

}
