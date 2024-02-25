package com.allergy.allergy.AllergyRecommendationSection.constants;

public class AllergyConstants {
    private String projectId = "allergy-management-service";
    private String projectLocation = "us-central1";
    private String modelName = "gemini-pro-vision";

    public AllergyConstants() {}

    public AllergyConstants(String projectId, String projectLocation, String modelName) {
        this.projectId = projectId;
        this.projectLocation = projectLocation;
        this.modelName = modelName;
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
}
