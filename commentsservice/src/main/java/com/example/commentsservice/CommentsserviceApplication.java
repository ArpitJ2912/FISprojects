package com.example.commentsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.commentsservice")
public class CommentsserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentsserviceApplication.class, args);
	}

}
