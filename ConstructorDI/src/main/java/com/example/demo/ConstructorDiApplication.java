package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConstructorDiApplication {
    
	
	public static void main(String[] args) {
		SpringApplication.run(ConstructorDiApplication.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car = context.getBean("Car",Car.class);
		car.drive();
		
	}

}
