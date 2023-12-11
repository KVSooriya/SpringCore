package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* If package other than packages or subpackages in which main class resides,
we need to explicitly specify packages
@SpringBootApplication(scanBasePackages = {"com.example.demo",
		                                   "com.example.springcore"}
)
*/
@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

}
