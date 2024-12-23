package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//Instead of Dispature Servlet

@Configuration
@ComponentScan("com.spring")
public class SpringWebConfig {
	
	@Bean
	 public InternalResourceViewResolver viewResolver() {
		System.out.println("Coming into Spring Web Config.");
		 InternalResourceViewResolver resourceViewResolver= new  InternalResourceViewResolver();
		 resourceViewResolver.setPrefix("/WEB-INF/jsp/");
		 resourceViewResolver.setSuffix(".jsp");   //Lets if you want to change this to JSF or Free marker or Velocity just come to this configuration and change the suffix that's it..
		 
		 return resourceViewResolver;
	 }
}
