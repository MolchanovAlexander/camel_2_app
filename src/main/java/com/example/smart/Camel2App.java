package com.example.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {
		"classpath:camel/camel-context.xml"
})
public class Camel2App {

	public static void main(String[] args) {
		SpringApplication.run(Camel2App.class, args);
	}

}
