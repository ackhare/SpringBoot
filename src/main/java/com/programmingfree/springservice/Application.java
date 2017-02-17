package com.programmingfree.springservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

/*
The @EnableJpaRepositories annotation activates Spring Data JPA.
 Spring Data JPA will create a concrete implementation of the TaskRepository
 and configure it to talk to a back end in-memory database using JPA.
 */
@Configuration
@ComponentScan
@EnableJpaRepositories
/*
@Import(RepositoryRestMvcConfiguration.class) annotation imports a collection of Spring MVC controllers,
JSON converters, and other beans needed to provide a RESTful front end.
These components link up to the Spring Data JPA backend.
*/
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
@PropertySource("application.properties")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);			
	}

}