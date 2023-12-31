package com.smartapps.smartappui.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SmartappUIApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartappUIApplication.class, args);
	}

}
