package com.example.dependency_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		// Initializing a Spring container
		/**
		 * Initializing the Spring container explicitly is not mandatory in all cases.
		 * When using the Spring framework in a web application, for example, the
		 * container is typically initialized automatically by the servlet container
		 * when the application starts up. In such cases, the container is bootstrapped
		 * based on the configuration provided in the web.xml file or through
		 * annotations.
		 * 
		 * Explicit Initialization allows us to:
		 * 
		 * 1. Customize the container
		 * 2. Access the container
		 * 3. Control the application flow
		 */
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

		// Dependency Injection
		/*
		 * We ain't gonna directly create an object and execute/implement it in a
		 * traditional manner. Rather we'd opt to "dependency injection" to achieve
		 * convention-over-configuration approach.
		 */
		Alien a1 = context.getBean(Alien.class);
		a1.whyHere();

		// Alien a2 = context.getBean(Alien.class);
		// a2.whyHere();

		/*
		 * Singleton scope ensures that even if we don't need or create the object,
		 * an object of "@component' annoted class is getting created anyway.
		 * 
		 * Having said that, if we create multitude of objects, still only one object
		 * will get created as it's bound by the "singleton" scope until and unless we
		 * use "prototype" scope.
		 */
	}

}
