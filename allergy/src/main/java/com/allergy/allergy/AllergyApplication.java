package com.allergy.allergy;

import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.preview.ChatSession;
import com.google.cloud.vertexai.generativeai.preview.GenerativeModel;
import com.google.cloud.vertexai.generativeai.preview.ResponseHandler;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

import java.io.IOException;

@SpringBootApplication
@Validated
public class AllergyApplication implements CommandLineRunner {

    public static void main(String[] args) throws IOException {
		SpringApplication.run(AllergyApplication.class, args);

	}
	@Override
	public void run(String... args) throws Exception {

	}
}
