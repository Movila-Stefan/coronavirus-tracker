package com.example.CoronaVirustraker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaVirusTrakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaVirusTrakerApplication.class, args);
	}

}
