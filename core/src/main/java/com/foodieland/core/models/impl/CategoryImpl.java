package com.foodieland.core.models.impl;

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
import com.foodieland.core.models.Category;

@Model(
		adaptables = {SlingHttpServletRequest.class},
		adapters = {Category.class},
		resourceType = {CategoryImpl.RESOURCE_TYPE},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class CategoryImpl implements Category {

	protected static final String RESOURCE_TYPE = "foodieland/components/category";
	
	@OSGiService
	private ModelFactory modelFactory;
	
	@Self
	private SlingHttpServletRequest request;
	
	private Image image;
	@ValueMapValue
	private String name;
	
	@Override
	public String getName() {
		return name;
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
		
		if(componentImage == null
				|| StringUtils.isBlank(componentImage.getSrc())) {
			
			return true;
			
		} else {
			
			return false;
			
		}
	}

}
