package com.foodieland.core.models.impl;
import java.util.Date;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.foodieland.core.models.Hero;


@Model(
		adaptables = {SlingHttpServletRequest.class},
		adapters = {Hero.class},
		resourceType = {HeroImpl.RESOURCE_TYPE},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HeroImpl implements Hero {
	
	protected static final String RESOURCE_TYPE = "foodieland/components/fl-hero";

	@ValueMapValue
	private String imageReference;
	@ValueMapValue
	private String imageAuthorReference;
	@ValueMapValue
	private String type;
	@ValueMapValue
	private String title;
	@ValueMapValue
	private String description;
	@ValueMapValue
	private String time;
	@ValueMapValue
	private String ingredient;
	@ValueMapValue
	private String name;
	@ValueMapValue
	private String linkURL;
	@ValueMapValue
	private Date date;

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getTime() {
		return time;
	}

	@Override
	public String getIngredient() {
		return ingredient;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getLinkURL() {
		return linkURL;
	}

	@Override
	public Date getDate() {
		return date;
	}
	
	@Override
	public String getImageReference() {
		return imageReference;
	}

	@Override
	public String getImageAuthorReference() {
		return imageAuthorReference;
	}

}
