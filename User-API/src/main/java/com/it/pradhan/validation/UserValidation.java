package com.it.pradhan.validation;

import com.it.pradhan.constants.UserConstants;

public class UserValidation {
	public static boolean isAadharValid(String aadharNumber) {
		return aadharNumber != null && aadharNumber.matches(UserConstants.AADHAR);
	}

	public static boolean isPanValid(String panNumber) {
		return panNumber != null && panNumber.matches(UserConstants.PAN);
	}

	public static boolean isValidName(String name) {
	      
        if (name == null || name.trim().isEmpty() || name.length() > 50 || !name.matches("[a-zA-Z ]+")) {
            return false;
        }
        name = name.trim();
        String[] parts = name.split(" ");
        if (parts.length != 2) {
            return false;
        }
        return isProperNameFormat(parts[0]) && isProperNameFormat(parts[1]);
    }

	private static boolean isProperNameFormat(String part) {
		return part.length() > 1 && Character.isUpperCase(part.charAt(0))
				&& part.substring(1).equals(part.substring(1).toLowerCase());

	}
	public static String capitalFirstLetter(String userName) {
	      
	      String name = userName.trim();
	        String[] partsName = name.split(" ");
	         if (partsName.length != 2) {
	           throw new IllegalArgumentException("Both First Name and Last Allowed");
	         }
	        boolean upperCase = Character.isUpperCase(partsName[0].charAt(0));
	      boolean lowerCase = partsName[1].substring(0).equals(partsName[1].substring(0).toLowerCase());
	    return new StringBuilder().append(upperCase).append(lowerCase).toString();
	      
	    }
}
