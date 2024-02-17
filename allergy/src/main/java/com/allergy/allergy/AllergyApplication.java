package com.allergy.allergy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication
@Validated
public class AllergyApplication implements CommandLineRunner {

    public static void main(String[] args) {
		SpringApplication.run(AllergyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
