package com.allergy.allergy.AllergyRecommendationSection.service;

import com.allergy.allergy.AllergyRecommendationSection.constants.AllergyConstants;
import com.allergy.allergy.AllergyRecommendationSection.model.Allergy;
import com.allergy.allergy.AllergyRecommendationSection.repository.AllergyRepository;
import com.allergy.allergy.User.model.User;
import com.allergy.allergy.User.repository.UserRepository;
import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.preview.ChatSession;
import com.google.cloud.vertexai.generativeai.preview.GenerativeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class AllergyService {

    //Initialize the allergy repository and autowire it with the Allergy Service constructor
    private final AllergyRepository allergyRepository;


    @Autowired
    public AllergyService(AllergyRepository allergyRepository, UserRepository userRepository) {
        this.allergyRepository = allergyRepository;
    }


    public Object allergyAiChatResponse(String userId, String message) throws IOException {
        AllergyConstants constants = new AllergyConstants();

        VertexAI vertexAI = new VertexAI(constants.getProjectId(), constants.getProjectLocation(), constants.getKey()); // Pass API key
        GenerativeModel generativeModel = new GenerativeModel(constants.getModelName(), vertexAI);
        ChatSession chatSession = new ChatSession(generativeModel);
        GenerateContentResponse contentResponse = chatSession.sendMessage(message);
        String response = contentResponse.getCandidates(0).getContent().getParts(0).getText();

        //Call the allergy model and set the userId and the message
        Allergy allergyModel = new Allergy();
        allergyModel.setUserId(userId);
        allergyModel.setMessage(message);
        allergyModel.setResponse(response);

        //Save the userId and message into the database/repository
        return allergyRepository.save(allergyModel);
    }

    //The allergy history
    public Object[] allergyHistory(String userId) {
        List<Allergy> allergyList = allergyRepository.findAllByUserId(userId);
        if (allergyList.isEmpty()) {
            throw new IllegalStateException("User id not found");
        } else {
            return allergyList.toArray();
        }
    }
}
