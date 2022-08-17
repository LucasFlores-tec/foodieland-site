package com.foodieland.core.models;

public interface Category {
	
	/**
	 * @return a String to display the category's name.
	 */
	String getName();
	
	/**
	 * @return a String with the path to the image.
	 */
	String getImageReference();
	
	/**
	 * @return a link to a page.
	 */
	String getLinkURL();

}
