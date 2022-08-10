package com.foodieland.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.foodieland.core.models.Category;

@Model(
		adaptables = {SlingHttpServletRequest.class},
		adapters = {Category.class},
		resourceType = {CategoryImpl.RESOURCE_TYPE},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class CategoryImpl implements Category {

	protected static final String RESOURCE_TYPE = "foodieland/components/category";

	@ValueMapValue
	private String name;
	
	@ValueMapValue
	private String imageReference;
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getImageReference() {
		return imageReference;
	}

}
