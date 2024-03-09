package com.allergy.allergy;

import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.vertexai.VertexAI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.IOException;

import static com.google.auth.oauth2.GoogleCredentials.*;

@SpringBootApplication
public class AllergyApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(AllergyApplication.class, args);

	}

	@Override
	public void run(String... args) {}
}
