package com.engimaorg.learning.linkedinlearningfullstackappangularspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.engimaorg.learning.rest")
@EnableAutoConfiguration
public class LinkedInLearningFullStackAppAngularSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkedInLearningFullStackAppAngularSpringBootApplication.class, args);
	}
}
