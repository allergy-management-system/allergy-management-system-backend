package com.allergy.allergy.AllergyRecommendationSection.aiResponseInstruction;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class AiResponseInstruction {

    @Id
    private String allergyId;
    @Field
    private String instructions = "";

    AiResponseInstruction() {

    }


}
