package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ConstructorBasedDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstructorBasedDiApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Car car = context.getBean("car",Car.class);
		car.drive();
	}

}
