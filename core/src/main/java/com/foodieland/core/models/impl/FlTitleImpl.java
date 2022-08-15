package com.foodieland.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.foodieland.core.models.FlTitle;

@Model(
		adaptables = {SlingHttpServletRequest.class},
		adapters = {FlTitle.class},
		resourceType = {FlTitleImpl.RESOURCE_TYPE},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class FlTitleImpl implements FlTitle {

	protected static final String RESOURCE_TYPE = "foodieland/components/fl-title";
	
	@ValueMapValue
	private String title;
	
	@Override
	public String getTitle() {
		return title;
	}

}
