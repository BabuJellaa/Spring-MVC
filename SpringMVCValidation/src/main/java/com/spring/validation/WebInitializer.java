package com.spring.validation;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.spring.validation.WebConfig;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Calling getServletConfigClasses.");
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Calling getServletMappings.");
		return new String[] {"/"};
	}

}