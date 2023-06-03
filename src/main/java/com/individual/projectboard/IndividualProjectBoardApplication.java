package com.individual.projectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class IndividualProjectBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndividualProjectBoardApplication.class, args);
	}

}
