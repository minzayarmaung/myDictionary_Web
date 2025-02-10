package com.myProject.myDictionary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.myProject.myDictionary.Entity"})
@ComponentScan(basePackages = {"com.myProject.myDictionary"})
public class MyDictionaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDictionaryApplication.class, args);
	}

}
