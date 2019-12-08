package com.todo.app.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EntityScan(basePackages = "com.todo.common.entity")
@EnableJpaRepositories(basePackages = "com.todo.dao")
@ComponentScan(basePackages = {"com.todo.services", "com.todo.web"})
public class AppWebMain {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(AppWebMain.class);
		app.run(args);
		System.out.println("Hello World!");
	}
}
