package com.foodieland.core.models;

public interface Course {
	
	/**
	 * @return a String with the component's title.
	 */
	String getTitle();
	
	/**
	 * @return a String with the component's description.
	 */
	String getDescription();
	
	/**
	 * @return a String to the component's image asset.
	 */
	String getImageReference();

	/**
	 * @return a link URL to the component's page.
	 */
	String getLinkURL();
}
