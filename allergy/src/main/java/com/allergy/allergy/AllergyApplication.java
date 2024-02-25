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

	// Ask interrelated questions in a row using a ChatSession object.
//	public static void chatDiscussion(String projectId, String location, String modelName)
//			throws IOException {
//		// Initialize client that will be used to send requests. This client only needs
//		// to be created once, and can be reused for multiple requests.
//		try (VertexAI vertexAI = new VertexAI(projectId, location)) {
//			GenerateContentResponse response;
//
//			GenerativeModel model = new GenerativeModel(modelName, vertexAI);
//			// Create a chat session to be used for interactive conversation.
//			ChatSession chatSession = new ChatSession(model);
//
//			response = chatSession.sendMessage("Hello.");
//			System.out.println(ResponseHandler.getText(response));
//
//			response = chatSession.sendMessage("What are all the colors in a rainbow?");
//			System.out.println(ResponseHandler.getText(response));
//
//			response = chatSession.sendMessage("Why does it appear when it rains?");
//			System.out.println(ResponseHandler.getText(response));
//			System.out.println("Chat Ended.");
//		}
//	}

	@Override
	public void run(String... args) throws Exception {

	}
}
