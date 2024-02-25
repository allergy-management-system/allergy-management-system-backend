package com.Allergy.AllergyApp.allergy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "assessments")
public class Assessment {
    @Id
    private String id;
    // Add fields for assessment data here

    // Constructors, getters, and setters
}
