package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class AppConfig {
	
	@Bean
	public Engine engineBean() {
		return new Engine("v8",5);
	}
    
	@Bean
	public String getBrandName() {
    	return"Baleno";
    }
}
