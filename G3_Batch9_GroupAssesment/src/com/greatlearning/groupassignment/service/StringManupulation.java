package com.greatlearning.groupassignment.service;

/**
 * StringManupulation class contains the methods for manupulation of strings
 **/

public class StringManupulation {
	
	// Method to convert the character from string to upper case
	public String charToUpperCase(String str, int position) {

		if (str == null || str.length() == 0)
			return "";

		if (str.length() == 1)
			return str.toUpperCase();

		char[] chArr = str.toCharArray();
		chArr[position] = Character.toUpperCase(chArr[position]);

		return new String(chArr);
	}

	// Method to convert the character from string to lower case
	public String charToLowerCase(String str, int position) {

		if (str == null || str.length() == 0)
			return "";

		if (str.length() == 1)
			return str.toLowerCase();

		char[] chArr = str.toCharArray();
		chArr[position] = Character.toLowerCase(chArr[position]);

		return new String(chArr);
	}
}
