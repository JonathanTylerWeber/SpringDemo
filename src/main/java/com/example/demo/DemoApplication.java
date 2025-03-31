package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext myAppContext = SpringApplication.run(DemoApplication.class, args);

		for (String beanName : myAppContext.getBeanDefinitionNames()){
			System.out.println(beanName);
		}

		MessageService messageService = myAppContext.getBean(MessageService.class);

		System.out.println(messageService.getMessage());

	}

}
