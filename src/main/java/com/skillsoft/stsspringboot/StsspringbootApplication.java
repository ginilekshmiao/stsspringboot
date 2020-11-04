package com.skillsoft.stsspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.skillsoft"})
public class StsspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StsspringbootApplication.class, args);
	}

}
