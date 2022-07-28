package com.foodieland.core.models;

public interface Category {
	
	/**
	 * @return a String to display the category's name.
	 */
	String getName();
	
	/**
	 * @return a boolean the check if there are any empty field.
	 */
	boolean isEmpty();

}
