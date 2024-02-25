package com.allergy.allergy.AllergyRecommendationSection.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document
public class AllergyModel {

    @Id
    private String allergyId;
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

    public AllergyModel () {

    }

    public AllergyModel(String peanuts, String fish, String eggs, String butter, String soyProducts, String milk, String otherNuts, String sugar, String mushroom, String gluten, String mustard, String other, String otherFoods, String timesOfReaction, String lastReaction, String causeOfReaction, String symptomsExperienced, String medicationAllergy, String additionalNotes) {
        //The foods that can cause allergy
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
    }

    public String getPeanuts() {
        return peanuts;
    }

    public void setPeanuts(String peanuts) {
        this.peanuts = peanuts;
    }

    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public String getEggs() {
        return eggs;
    }

    public void setEggs(String eggs) {
        this.eggs = eggs;
    }

    public String getButter() {
        return butter;
    }

    public void setButter(String butter) {
        this.butter = butter;
    }

    public String getSoyProducts() {
        return soyProducts;
    }

    public void setSoyProducts(String soyProducts) {
        this.soyProducts = soyProducts;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getOtherNuts() {
        return otherNuts;
    }

    public void setOtherNuts(String otherNuts) {
        this.otherNuts = otherNuts;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getMushroom() {
        return mushroom;
    }

    public void setMushroom(String mushroom) {
        this.mushroom = mushroom;
    }

    public String getGluten() {
        return gluten;
    }

    public void setGluten(String gluten) {
        this.gluten = gluten;
    }

    public String getMustard() {
        return mustard;
    }

    public void setMustard(String mustard) {
        this.mustard = mustard;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getOtherFoods() {
        return otherFoods;
    }

    public void setOtherFoods(String otherFoods) {
        this.otherFoods = otherFoods;
    }

    public String getTimesOfReaction() {
        return timesOfReaction;
    }

    public void setTimesOfReaction(String timesOfReaction) {
        this.timesOfReaction = timesOfReaction;
    }

    public String getLastReaction() {
        return lastReaction;
    }

    public void setLastReaction(String lastReaction) {
        this.lastReaction = lastReaction;
    }

    public String getCauseOfReaction() {
        return causeOfReaction;
    }

    public void setCauseOfReaction(String causeOfReaction) {
        this.causeOfReaction = causeOfReaction;
    }

    public String getSymptomsExperienced() {
        return symptomsExperienced;
    }

    public void setSymptomsExperienced(String symptomsExperienced) {
        this.symptomsExperienced = symptomsExperienced;
    }

    public String getMedicationAllergy() {
        return medicationAllergy;
    }

    public void setMedicationAllergy(String medicationAllergy) {
        this.medicationAllergy = medicationAllergy;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    @Override
    public String toString() {
        return "FormFields{" +
                "peanuts='" + peanuts + '\'' +
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
                '}';
    }
}

