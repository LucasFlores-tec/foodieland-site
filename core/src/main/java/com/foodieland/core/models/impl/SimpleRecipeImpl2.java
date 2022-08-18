package com.foodieland.core.models.impl;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.foodieland.core.models.SimpleRecipe2;

@Model( 
		adaptables = {SlingHttpServletRequest.class},
		adapters = {SimpleRecipe2.class},
		resourceType = {SimpleRecipeImpl2.RESOURCE_TYPE},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class SimpleRecipeImpl2 implements SimpleRecipe2 {
	
	protected static final String RESOURCE_TYPE = "foodieland/components/fl-simplerecipe2";
	
	@ValueMapValue
	private String imageReference;
	@ValueMapValue
	private String title;
	@ValueMapValue
	private String time;
	@ValueMapValue
	private String category;
	@ValueMapValue
	private String linkURL;
	
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
		return category;
	}
	
	@Override
	public String getImageReference() {
		return imageReference;
	}

	@Override
	public String getLinkURL() {
		if(linkURL != null){
			linkURL = linkURL.concat(".html");
		}
		return linkURL;
	}

}
