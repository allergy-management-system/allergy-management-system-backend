package com.allergy.allergy.AllergyRecommendationSection.controllers;

import com.allergy.allergy.AllergyRecommendationSection.constants.AllergyConstants;
import com.allergy.allergy.AllergyRecommendationSection.service.AllergyService;
import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.preview.ChatSession;
import com.google.cloud.vertexai.generativeai.preview.GenerativeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/allergy")
public class AllergyController {

    //Initialize the allergy service
    private final AllergyService allergyService;
    @Autowired
    public AllergyController(AllergyService allergyService) {
        this.allergyService = allergyService;
    }


    @PostMapping("/chat")
    public String ChatDiscussion(@RequestBody String message) throws IOException {
        AllergyConstants constants = new AllergyConstants();
        
        VertexAI vertexAI = new VertexAI(constants.getProjectId(), constants.getProjectLocation());
        GenerativeModel generativeModel = new GenerativeModel(constants.getModelName(), vertexAI);
        ChatSession chatSession = new ChatSession(generativeModel);
        GenerateContentResponse contentResponse = chatSession.sendMessage(message);
        return contentResponse.getCandidates(0).getContent().getParts(0).getText();
    }
}
