package com.allergy.allergy.AllergyRecommendationSection.controllers;

import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.preview.ChatSession;
import com.google.cloud.vertexai.generativeai.preview.GenerativeModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class AllergyController {

    final String projectId = "allergy-management-service";
    final String projectLocation = "us-central1";
    final String modelName = "gemini-pro-vision";

    @PostMapping("/chat")
    public String ChatDiscussion(@RequestBody String message) throws IOException {
        VertexAI vertexAI = new VertexAI(projectId, projectLocation);
        GenerativeModel generativeModel = new GenerativeModel(modelName, vertexAI);
        ChatSession chatSession = new ChatSession(generativeModel);
        GenerateContentResponse contentResponse = chatSession.sendMessage(message);
        return contentResponse.getCandidates(0).getContent().getParts(0).getText();
    }
}
