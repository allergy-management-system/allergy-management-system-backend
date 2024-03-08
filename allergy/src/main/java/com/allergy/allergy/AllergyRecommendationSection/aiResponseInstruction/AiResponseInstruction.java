package com.allergy.allergy.AllergyRecommendationSection.aiResponseInstruction;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class AiResponseInstruction {

    @Id
    private String allergyId;
    @Field
    private String instructions = "Hi Gemini, I need your advice on allergy: Here are few rules I want you to follow before giving an answer. Rule 1. UserInput: I have a stuffy and running nose. Your response should follow this format: 1. Give me immediate home procedures to follow in order to manage the allergy'. 2. Go ahead to recommend internationally accepted allergy management medical prescriptions to solve my allergy. 3. And advice me to seek medical attention if the prescriptions or home remedies did not work for me";


}
