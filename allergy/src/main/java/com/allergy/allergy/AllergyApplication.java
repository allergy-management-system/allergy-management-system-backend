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
	static final String SERVICE_ACCOUNT_KEY_FILE = "service.json";
	public static void main(String[] args) {
		SpringApplication.run(AllergyApplication.class, args);
		try {
			Credentials credentials = loadCredentials();
			// Use the credentials to authenticate with Google service(s)
			// ...
		} catch (IOException e) {
			System.err.println("Error loading credentials: " + e.getMessage());
			// Handle the exception appropriately
		}

	}

	@Override
	public void run(String... args) {}

	private static Credentials loadCredentials() throws IOException {
		FileInputStream serviceAccountStream = new FileInputStream("allergy/src/main/java/com/allergy/allergy/service.json");
		return GoogleCredentials.fromStream(serviceAccountStream)
				.createScoped(/* list of desired scopes */);
	}
}
