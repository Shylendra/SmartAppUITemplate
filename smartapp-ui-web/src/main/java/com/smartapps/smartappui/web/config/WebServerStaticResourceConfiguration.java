package com.smartapps.smartappui.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@Configuration
public class WebServerStaticResourceConfiguration extends WebMvcConfigurerAdapter {
	
	@Value("${spring.application.name}")
	private String appName;

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/" + appName).setViewName("forward:/index.html");
	}

}
