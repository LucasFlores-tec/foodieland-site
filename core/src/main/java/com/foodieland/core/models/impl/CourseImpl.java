package com.foodieland.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.foodieland.core.models.Course;

@Model (
		adaptables = {SlingHttpServletRequest.class},
		adapters = {Course.class},
		resourceType = {CourseImpl.RESOURCE_TYPE},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class CourseImpl implements Course {

	protected static final String RESOURCE_TYPE = "foodieland/components/fl-course";
	
	@ValueMapValue
	private String title;
	@ValueMapValue
	private String description;
	@ValueMapValue
	private String imageReference;
	@ValueMapValue
	private String linkURL;
	
	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getDescription() {
		return description;
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
