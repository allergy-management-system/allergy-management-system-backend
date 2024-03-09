package com.allergy.allergy.AllergyRecommendationSection.constants;

public class AllergyConstants {
    private String projectId = "allergy-management-service";
    private String projectLocation = "us-central1";
    private String modelName = "gemini-pro-vision";
    private String key = "AIzaSyBekECJcc99ByfMA_j-gjCqYW4vcoWFzuc";
//    private String credentials = "allergy/service.json";

    public AllergyConstants() {}

    public AllergyConstants(String projectId, String projectLocation, String modelName, String key, String credentials) {
        this.projectId = projectId;
        this.projectLocation = projectLocation;
        this.modelName = modelName;
        this.key = key;
//        this.credentials = credentials;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getProjectLocation() {
        return projectLocation;
    }

    public String getModelName() {
        return modelName;
    }

    public String getKey() { return key; }

//    public String getCredentials() { return credentials; }
}
