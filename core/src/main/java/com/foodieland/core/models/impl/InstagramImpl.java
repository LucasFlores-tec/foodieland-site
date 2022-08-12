package com.foodieland.core.models.impl;

import static java.util.Collections.emptyList;
import static java.util.Collections.sort;

import java.util.ArrayList;
import java.util.List;

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

	protected static final String RESOURCE_TYPE = "foodieland/components/instagram";
	
	@ValueMapValue
	private List<String> imagesReference;
	
	@Override
	public List<String> getImagesReference() {
		if(imagesReference != null) {
			sort(imagesReference);
			return new ArrayList<String>(imagesReference);
		} else {
			return emptyList();
		}
	}

}
