package com.allergy.allergy.AllergyRecommendationSection.controllers;

import com.allergy.allergy.AllergyRecommendationSection.service.AllergyService;
import org.springframework.beans.factory.annotation.Autowired;
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
        return allergyService.allergyAiChatResponse(message);
    }
}
