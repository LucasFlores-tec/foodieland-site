package com.foodieland.core.models.impl;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.factory.ModelFactory;

import com.adobe.cq.wcm.core.components.models.Image;
import com.foodieland.core.models.Recipe;


@Model(
		adaptables = {SlingHttpServletRequest.class},
		adapters = {Recipe.class},
		resourceType = {RecipeImpl.RESOURCE_TYPE},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class RecipeImpl implements Recipe {
	
	protected static final String RESOURCE_TYPE = "foodieland/components/recipe";

	@OSGiService
	private ModelFactory modelFactory;
	
	@Self
	private SlingHttpServletRequest request;

	private Image image;

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

	private Image getImage() {
		return image;
	}
	
	@PostConstruct
	private void init() {
		image = modelFactory.getModelFromWrappedRequest(request, request.getResource(), Image.class);
	}

	@Override
	public boolean isEmpty() {
		final Image componentImage = getImage();
		
		if(StringUtils.isBlank(title)
				|| StringUtils.isBlank(type)
				|| StringUtils.isBlank(description) 
				|| StringUtils.isBlank(time) 
				|| StringUtils.isBlank(ingredient) 
				|| StringUtils.isBlank(name)
				|| componentImage == null
				|| StringUtils.isBlank(componentImage.getSrc())) {
			return true;
		} else {
			return false;
		}
	}


}
