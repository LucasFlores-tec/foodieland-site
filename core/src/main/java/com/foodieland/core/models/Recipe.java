package com.foodieland.core.models;

import java.util.Date;

/**
 * Represents the Recipe AEM Component for the foodieland site.
 */
public interface Recipe {
	
	/**
	 * @return a String to display as the recipe's tag.
	 */
	String getType();
	
	/**
	 * @return a String to display as the recipe's title.
	 */
	String getTitle();
	
	/**
	 * @return a String to display as the recipe's description.
	 */
	String getDescription();
	
	/**
	 * @return a String to display as the recipe's time to prepare.
	 */
	String getTime();
	
	/**
	 * @return a String to display as the recipe's main ingredient.
	 */
	String getIngredient();
	
	/**
	 * @return a String to display as the recipe's author.
	 */
	String getName();
	
	/**
	 * @return a String with the button's link.
	 */
	String getLink();
	
	/**
	 * @return a Date to display as the recipe's post date.
	 */
	Date getDate();
	
	/**
	 * @return a String with the path to the image.
	 */
	String getImageReference();
	
	/**
	 * @return a String with the path to the author's image.
	 */
	String getImageAuthorReference();
	

}
