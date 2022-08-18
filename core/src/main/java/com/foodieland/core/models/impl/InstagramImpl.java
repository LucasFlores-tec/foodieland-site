package com.foodieland.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.foodieland.core.models.Instagram;

@Model(
		adaptables = {SlingHttpServletRequest.class},
		adapters = {Instagram.class},
		resourceType = {InstagramImpl.RESOURCE_TYPE},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
		)
public class InstagramImpl implements Instagram {

	protected static final String RESOURCE_TYPE = "foodieland/components/fl-instagram";
	
	@ValueMapValue
	private String imageReference;
	@ValueMapValue
	private String linkURL;
	
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
