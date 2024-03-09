package com.allergy.allergy.AllergyRecommendationSection.service;

import com.allergy.allergy.AllergyRecommendationSection.constants.AllergyConstants;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.preview.ChatSession;
import com.google.cloud.vertexai.generativeai.preview.GenerativeModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;

@Service
public class AllergyService {


    public String allergyAiChatResponse(String message) throws IOException {
        AllergyConstants constants = new AllergyConstants();

        //set the  google credentials
        //String googleCredentialsString = constants.getCredentials();

        //create google credentials from the credential string
        GoogleCredentials googleCredentials = GoogleCredentials.fromStream(
                new FileInputStream("allergy/service.json")
        );

        VertexAI vertexAI = new VertexAI(constants.getProjectId(), constants.getProjectLocation(), constants.getKey()); // Pass API key
        GenerativeModel generativeModel = new GenerativeModel(constants.getModelName(), vertexAI);
        ChatSession chatSession = new ChatSession(generativeModel);
        GenerateContentResponse contentResponse = chatSession.sendMessage(message);
        return contentResponse.getCandidates(0).getContent().getParts(0).getText();
    }
}
