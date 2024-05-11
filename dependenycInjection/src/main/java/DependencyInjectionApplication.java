package com.spring.learning.com.spring.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionConceptApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionConceptApplication.class, args);
		Employee emp =context.getBean(Employee.class);
		emp.display();
		//spring provides advantage that no need to focus on object creation every time we can focus on logic
		//when required dependency injection provides object
		//Employee emp = new Employee();
		
		
	}

}
