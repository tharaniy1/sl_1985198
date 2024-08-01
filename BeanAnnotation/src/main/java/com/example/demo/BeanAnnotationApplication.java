package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanAnnotationApplication.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car audi = context.getBean("carBean",Car.class);
		audi.test();
	}

}
