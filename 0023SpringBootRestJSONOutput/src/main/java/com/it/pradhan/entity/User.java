package com.it.pradhan.entity;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	public User(int i, String string, String string2, Set<String> of) {
		
	}

	private Integer userId;
	
	private String userName;
	
	private String userRole;
	
}
