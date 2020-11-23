package com.example.PrintingName;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
		
	@Bean
	public Sample createSample() {
		System.out.println("sandeep-----------------");
		return new Sample();
	}
}
