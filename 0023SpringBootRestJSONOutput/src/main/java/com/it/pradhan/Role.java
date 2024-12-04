package com.it.pradhan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
	
	//@JsonIgnore
	private Integer roleId;
	
	private String roleCode;

}
