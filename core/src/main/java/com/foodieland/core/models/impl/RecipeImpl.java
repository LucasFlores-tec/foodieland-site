package com.foodieland.core.models.impl;
import java.util.Date;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.foodieland.core.models.Recipe;


@Model(
		adaptables = {SlingHttpServletRequest.class},
		adapters = {Recipe.class},
		resourceType = {RecipeImpl.RESOURCE_TYPE},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class RecipeImpl implements Recipe {
	
	protected static final String RESOURCE_TYPE = "foodieland/components/recipe";

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
	private String link;
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
	public String getLink() {
		return link;
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
