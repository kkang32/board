package com.thevruk.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {

	@RequestMapping("/")
	String home() {
		return "Hello World!111";
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
