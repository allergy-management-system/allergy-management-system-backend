package com.Allergy.AllergyApp.allergy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;

@Document(collection = "allergies")
public class Allergy {
    @Id
    private String id;
    private String userId;
    private String name;
    private String severity;
    private String reaction;
    private Date diagnosisDate;
    private Date timestamp;

    // fields from the allergy assessment form
    private String medicalHistory;
    private String existingMedicalConditions;
    private String medications;
    private String familyHistory;
    private List<String> symptoms;
    private String symptomSeverity;
    private String symptomDuration;
    private String symptomOccurrence;
    private String allergyExposure;
    private String knownAllergies;
    private String dietaryRestrictions;
    private String diagnosticTests;
    private String ongoingTreatment;
    private String responseToTreatment;
    private String epinephrineUsage;
    private String petsAtHome;
    private String environmentalExposure;
    private String smokingStatus;
    private String additionalInformation;


    public Allergy() {
    }

    //constructors
    public Allergy(String userId, String name, String severity, String reaction, Date diagnosisDate, Date timestamp) {
        this.userId = userId;
        this.name = name;
        this.severity = severity;
        this.reaction = reaction;
        this.diagnosisDate = diagnosisDate;
        this.timestamp = timestamp;
    }

    public Allergy(String id, String userId, String name, String severity, String reaction, Date diagnosisDate, Date timestamp, String medicalHistory, String existingMedicalConditions, String medications, String familyHistory, List<String> symptoms, String symptomSeverity, String symptomDuration, String symptomOccurrence, String allergyExposure, String knownAllergies, String dietaryRestrictions, String diagnosticTests, String ongoingTreatment, String responseToTreatment, String epinephrineUsage, String petsAtHome, String environmentalExposure, String smokingStatus, String additionalInformation) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.severity = severity;
        this.reaction = reaction;
        this.diagnosisDate = diagnosisDate;
        this.timestamp = timestamp;
        this.medicalHistory = medicalHistory;
        this.existingMedicalConditions = existingMedicalConditions;
        this.medications = medications;
        this.familyHistory = familyHistory;
        this.symptoms = symptoms;
        this.symptomSeverity = symptomSeverity;
        this.symptomDuration = symptomDuration;
        this.symptomOccurrence = symptomOccurrence;
        this.allergyExposure = allergyExposure;
        this.knownAllergies = knownAllergies;
        this.dietaryRestrictions = dietaryRestrictions;
        this.diagnosticTests = diagnosticTests;
        this.ongoingTreatment = ongoingTreatment;
        this.responseToTreatment = responseToTreatment;
        this.epinephrineUsage = epinephrineUsage;
        this.petsAtHome = petsAtHome;
        this.environmentalExposure = environmentalExposure;
        this.smokingStatus = smokingStatus;
        this.additionalInformation = additionalInformation;
    }


    // Getters and setters

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getExistingMedicalConditions() {
        return existingMedicalConditions;
    }

    public void setExistingMedicalConditions(String existingMedicalConditions) {
        this.existingMedicalConditions = existingMedicalConditions;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public String getFamilyHistory() {
        return familyHistory;
    }

    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    public String getSymptomSeverity() {
        return symptomSeverity;
    }

    public void setSymptomSeverity(String symptomSeverity) {
        this.symptomSeverity = symptomSeverity;
    }

    public String getSymptomDuration() {
        return symptomDuration;
    }

    public void setSymptomDuration(String symptomDuration) {
        this.symptomDuration = symptomDuration;
    }

    public String getSymptomOccurrence() {
        return symptomOccurrence;
    }

    public void setSymptomOccurrence(String symptomOccurrence) {
        this.symptomOccurrence = symptomOccurrence;
    }

    public String getAllergyExposure() {
        return allergyExposure;
    }

    public void setAllergyExposure(String allergyExposure) {
        this.allergyExposure = allergyExposure;
    }

    public String getKnownAllergies() {
        return knownAllergies;
    }

    public void setKnownAllergies(String knownAllergies) {
        this.knownAllergies = knownAllergies;
    }

    public String getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void setDietaryRestrictions(String dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public String getDiagnosticTests() {
        return diagnosticTests;
    }

    public void setDiagnosticTests(String diagnosticTests) {
        this.diagnosticTests = diagnosticTests;
    }

    public String getOngoingTreatment() {
        return ongoingTreatment;
    }

    public void setOngoingTreatment(String ongoingTreatment) {
        this.ongoingTreatment = ongoingTreatment;
    }

    public String getResponseToTreatment() {
        return responseToTreatment;
    }

    public void setResponseToTreatment(String responseToTreatment) {
        this.responseToTreatment = responseToTreatment;
    }

    public String getEpinephrineUsage() {
        return epinephrineUsage;
    }

    public void setEpinephrineUsage(String epinephrineUsage) {
        this.epinephrineUsage = epinephrineUsage;
    }

    public String getPetsAtHome() {
        return petsAtHome;
    }

    public void setPetsAtHome(String petsAtHome) {
        this.petsAtHome = petsAtHome;
    }

    public String getEnvironmentalExposure() {
        return environmentalExposure;
    }

    public void setEnvironmentalExposure(String environmentalExposure) {
        this.environmentalExposure = environmentalExposure;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getUserId() {

        return userId;
    }

    public void setUserId(String userId) {

        this.userId = userId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSeverity() {

        return severity;
    }

    public void setSeverity(String severity) {

        this.severity = severity;
    }

    public String getReaction() {

        return reaction;
    }

    public void setReaction(String reaction) {

        this.reaction = reaction;
    }

    public Date getDiagnosisDate() {

        return diagnosisDate;
    }

    public void setDiagnosisDate(Date diagnosisDate) {

        this.diagnosisDate = diagnosisDate;
    }

    public Date getTimestamp() {

        return timestamp;
    }

    public void setTimestamp(Date timestamp) {

        this.timestamp = timestamp;
    }
}
