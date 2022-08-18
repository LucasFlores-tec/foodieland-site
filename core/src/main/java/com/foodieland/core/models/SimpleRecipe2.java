package com.foodieland.core.models;

public interface SimpleRecipe2 {
	/**
	 * @return a String with the title of the component Simple Recipe.
	 */
	String getTitle();
	
	/**
	 * @return a String with the time to prepare of the component Simple Recipe.
	 */
	String getTime();
	
	/**
	 * @return a String with the category of the component Simple Recipe.
	 */
	String getCategory();
	
	/**
	 * @return a String with the path to the image asset.
	 */
	String getImageReference();
	
	/**
	 * @return a String with a link URL to a page.
	 */
	String getLinkURL();
}
