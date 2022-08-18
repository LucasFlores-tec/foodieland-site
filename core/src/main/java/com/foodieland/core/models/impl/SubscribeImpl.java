package com.foodieland.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.foodieland.core.models.Subscribe;

@Model(adaptables = {SlingHttpServletRequest.class},
		adapters = {Subscribe.class},
		resourceType = {SubscribeImpl.RESOURCE_TYPE},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
		)
public class SubscribeImpl implements Subscribe {

	protected static final String RESOURCE_TYPE = "foodieland/components/fl-subscribe";
	
	@ValueMapValue
	private String title;
	@ValueMapValue
	private String description;
	
	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
