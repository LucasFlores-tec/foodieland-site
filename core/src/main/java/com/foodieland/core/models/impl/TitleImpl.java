package com.foodieland.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.foodieland.core.models.Title;

@Model(adaptables = {SlingHttpServletRequest.class},
		adapters = {Title.class},
		resourceType = {TitleImpl.RESOURCE_TYPE},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TitleImpl implements Title {

	protected static final String RESOURCE_TYPE = "foodieland/components/fl-title";
	
	@ValueMapValue
	private String componentTitle;
	
	@Override
	public String getComponentTitle() {
		return componentTitle;
	}

}
