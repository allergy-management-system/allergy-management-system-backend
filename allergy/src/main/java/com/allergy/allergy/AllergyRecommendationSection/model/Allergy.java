package com.allergy.allergy.AllergyRecommendationSection.model;

import com.google.api.client.util.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Document
public class Allergy {
    @Id
    private String allergyId;
    @Field
    private String userId;
    @Field
    private String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    @Field
    private String peanuts;
    @Field
    private String fish;
    @Field
    private String eggs;
    @Field
    private String butter;
    @Field
    private String soyProducts;
    @Field
    private String milk;
    @Field
    private String otherNuts;
    @Field
    private String sugar;
    @Field
    private String mushroom;
    @Field
    private String gluten;
    @Field
    private String mustard;
    @Field
    private String other;
    @Field
    private String otherFoods;
    @Field
    private String timesOfReaction;
    @Field
    private String lastReaction;
    @Field
    private String causeOfReaction;
    @Field
    private String symptomsExperienced;
    @Field
    private String medicationAllergy;
    @Field
    private String additionalNotes;
    @Field
    private String message;
    @Field
    private String response;

    public Allergy () {    }

    public Allergy(String userId, String peanuts, String date, String fish, String eggs, String butter, String soyProducts, String milk, String otherNuts, String sugar, String mushroom, String gluten, String mustard, String other, String otherFoods, String timesOfReaction, String lastReaction, String causeOfReaction, String symptomsExperienced, String medicationAllergy, String additionalNotes, String message, String response) {
        //The foods that can cause allergy
        this.userId = userId;
        this.date = date;
        this.peanuts = peanuts;
        this.fish = fish;
        this.eggs = eggs;
        this.butter = butter;
        this.soyProducts = soyProducts;
        this.milk = milk;
        this.otherNuts = otherNuts;
        this.sugar = sugar;
        this.mushroom = mushroom;
        this.gluten = gluten;
        this.mustard = mustard;
        this.other = other; //Other foods not in the category given
        this.otherFoods = otherFoods;

        //Other relevant information
        this.timesOfReaction = timesOfReaction; // How many have you experience the reaction: 1. Never 2. Once 3. More than once
        this.lastReaction = lastReaction; // The last time/date you had an allergy
        this.causeOfReaction = causeOfReaction; //1. Eating Foods 2. Touching Foods 3. Smelling Foods 4. others
        this.symptomsExperienced = symptomsExperienced; // Cause of the allergy: 1. Eating the food 2. Touching the food 3. Smelling the food 4. If not specify
        this.medicationAllergy = medicationAllergy; //Have you had any allergy medication: Yes or No
        this.additionalNotes = additionalNotes; // Other things you want to add

        //The fully compiled message
        this.message = message;
        this.response = response;
    }

    public String getAllergyId() {
        return allergyId;
    }

    public void setAllergyId(String allergyId) {
        this.allergyId = allergyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPeanuts() {
        return peanuts;
    }

    public String setPeanuts(String peanuts) {
        this.peanuts = peanuts;
        return peanuts;
    }

    public String getFish() {
        return fish;
    }

    public String setFish(String fish) {
        this.fish = fish;
        return fish;
    }

    public String getEggs() {
        return eggs;
    }

    public String setEggs(String eggs) {
        this.eggs = eggs;
        return eggs;
    }

    public String getButter() {
        return butter;
    }

    public String setButter(String butter) {
        this.butter = butter;
        return butter;
    }

    public String getSoyProducts() {
        return soyProducts;
    }

    public String setSoyProducts(String soyProducts) {
        this.soyProducts = soyProducts;
        return soyProducts;
    }

    public String getMilk() {
        return milk;
    }

    public String setMilk(String milk) {
        this.milk = milk;
        return milk;
    }

    public String getOtherNuts() {
        return otherNuts;
    }

    public String setOtherNuts(String otherNuts) {
        this.otherNuts = otherNuts;
        return otherNuts;
    }

    public String getSugar() {
        return sugar;
    }

    public String setSugar(String sugar) {
        this.sugar = sugar;
        return sugar;
    }

    public String getMushroom() {
        return mushroom;
    }

    public String setMushroom(String mushroom) {
        this.mushroom = mushroom;
        return mushroom;
    }

    public String getGluten() {
        return gluten;
    }

    public String setGluten(String gluten) {
        this.gluten = gluten;
        return gluten;
    }

    public String getMustard() {
        return mustard;
    }

    public String setMustard(String mustard) {
        this.mustard = mustard;
        return mustard;
    }

    public String getOther() {
        return other;
    }

    public String setOther(String other) {
        this.other = other;
        return other;
    }

    public String getOtherFoods() {
        return otherFoods;
    }

    public String setOtherFoods(String otherFoods) {
        this.otherFoods = otherFoods;
        return otherFoods;
    }

    public String getTimesOfReaction() {
        return timesOfReaction;
    }

    public String setTimesOfReaction(String timesOfReaction) {
        this.timesOfReaction = timesOfReaction;
        return timesOfReaction;
    }

    public String getLastReaction() {
        return lastReaction;
    }

    public String setLastReaction(String lastReaction) {
        this.lastReaction = lastReaction;
        return lastReaction;
    }

    public String getCauseOfReaction() {
        return causeOfReaction;
    }

    public String setCauseOfReaction(String causeOfReaction) {
        this.causeOfReaction = causeOfReaction;
        return causeOfReaction;
    }

    public String getSymptomsExperienced() {
        return symptomsExperienced;
    }

    public String setSymptomsExperienced(String symptomsExperienced) {
        this.symptomsExperienced = symptomsExperienced;
        return symptomsExperienced;
    }

    public String getMedicationAllergy() {
        return medicationAllergy;
    }

    public String setMedicationAllergy(String medicationAllergy) {
        this.medicationAllergy = medicationAllergy;
        return medicationAllergy;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public String setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
        return additionalNotes;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "FormFields{" +
                "userId='" + userId + '\'' +
                ", date='" + date + '\'' +
                ", peanuts='" + peanuts + '\'' +
                ", fish='" + fish + '\'' +
                ", eggs='" + eggs + '\'' +
                ", butter='" + butter + '\'' +
                ", soyProducts='" + soyProducts + '\'' +
                ", milk='" + milk + '\'' +
                ", otherNuts='" + otherNuts + '\'' +
                ", sugar='" + sugar + '\'' +
                ", mushroom='" + mushroom + '\'' +
                ", gluten='" + gluten + '\'' +
                ", mustard='" + mustard + '\'' +
                ", other='" + other + '\'' +
                ", otherFoods='" + otherFoods + '\'' +
                ", timesOfReaction='" + timesOfReaction + '\'' +
                ", lastReaction='" + lastReaction + '\'' +
                ", causeOfReaction='" + causeOfReaction + '\'' +
                ", symptomsExperienced='" + symptomsExperienced + '\'' +
                ", medicationAllergy='" + medicationAllergy + '\'' +
                ", additionalNotes='" + additionalNotes + '\'' +
                ", message='" + message + '\'' +
                ", response='" + response + '\'' +
                '}';
    }
}

