package com.github.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloGithubActionsApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloGithubActionsApplication.class, args);
	}

	@GetMapping(value = "/welcome")
	public String hello() {
		System.out.println("foo");
		return "GithubActions Demo project";
	}

}
