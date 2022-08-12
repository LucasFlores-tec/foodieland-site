package com.foodieland.core.models.impl;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.foodieland.core.models.SimpleRecipe;

@Model( 
		adaptables = {SlingHttpServletRequest.class},
		adapters = {SimpleRecipe.class},
		resourceType = {SimpleRecipeImpl.RESOURCE_TYPE},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class SimpleRecipeImpl implements SimpleRecipe {
	
	protected static final String RESOURCE_TYPE = "foodieland/components/simplerecipe";
	
	@ValueMapValue
	private String imageReference;
	@ValueMapValue
	private String title;
	@ValueMapValue
	private String time;
	@ValueMapValue
	private String category;
	
	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getTime() {
		return time;
	}

	@Override
	public String getCategory() {
		String choosenCategory = null;
		switch(category) {
		case "Breakfast": choosenCategory = "Breakfafst";
		case "Vegan": choosenCategory = "Vegan";
		case "Meat": choosenCategory = "Meat";
		case "Dessert": choosenCategory = "Dessert";
		case "Lunch": choosenCategory = "Lunch";
		case "Chocolate": choosenCategory = "Chocolate";
		case "Snack": choosenCategory = "Snack";
		case "Fish": choosenCategory = "Fish";
		case "Healthy": choosenCategory = "Healthy";
		case "Sweet": choosenCategory = "Sweet";
		case "Noodles": choosenCategory = "Noodles";
		}
		return choosenCategory;
	}
	
	@Override
	public String getImageReference() {
		return imageReference;
	}

}
