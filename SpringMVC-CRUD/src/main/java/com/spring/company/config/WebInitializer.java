package com.spring.company.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

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
