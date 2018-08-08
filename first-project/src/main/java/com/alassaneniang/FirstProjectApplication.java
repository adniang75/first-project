package com.alassaneniang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class FirstProjectApplication {
    
    @RequestMapping("/")
    public String home() {
        return "Hello World from Spring Boot";
    }

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}
}
