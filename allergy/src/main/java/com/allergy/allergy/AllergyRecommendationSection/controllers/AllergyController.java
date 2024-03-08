package com.allergy.allergy.AllergyRecommendationSection.controllers;

import com.allergy.allergy.AllergyRecommendationSection.aiResponseInstruction.AiResponseInstruction;
import com.allergy.allergy.AllergyRecommendationSection.model.AllergyModel;
import com.allergy.allergy.AllergyRecommendationSection.service.AllergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public String ChatDiscussion(
            @RequestParam String peanuts,
            @RequestParam String fish,
            @RequestParam String eggs,
            @RequestParam String butter,
            @RequestParam String soyProducts,
            @RequestParam String milk,
            @RequestParam String otherNuts,
            @RequestParam String sugar,
            @RequestParam String mushrooms,
            @RequestParam String gluten,
            @RequestParam String mustard,
            @RequestParam String otherFoods,
            @RequestParam String timesOfReaction,
            @RequestParam String lastReaction,
            @RequestParam String causeOfReaction,
            @RequestParam String symptomExperienced,
            @RequestParam String medicationAllergy,
            @RequestParam String additionalNotes
    ) throws IOException {
        //Initialize the allergy model:
        AllergyModel allergyModel = new AllergyModel();
        String message =
                "Hi Gemini, I need your advice on allergy: Here are few rules I want you to follow before giving an answer. " +
                "Rule 1. UserInput: " +
                "I have allergies to " +
                        allergyModel.setPeanuts(peanuts) + " " +
                        allergyModel.setEggs(eggs) + " " +
                        allergyModel.setFish(fish) + " " +
                        allergyModel.setButter(butter) + " " +
                        allergyModel.setSoyProducts(soyProducts) + " " +
                        allergyModel.setMilk(milk) + " " +
                        allergyModel.setOtherNuts(otherNuts) + " " +
                        allergyModel.setSugar(sugar) + " " +
                        allergyModel.setMushroom(mushrooms) + " " +
                        allergyModel.setGluten(gluten) + " " +
                        allergyModel.setMustard(mustard) + " and " +
                        allergyModel.setOtherFoods(otherFoods) + " " +
                "My reactions occur at " +
                        allergyModel.setTimesOfReaction(timesOfReaction) + " " +
                "with the last reaction happening " +
                        allergyModel.setLastReaction(lastReaction) + " " +
                "The cause of my reactions is " +
                        allergyModel.setCauseOfReaction(causeOfReaction) + " " +
                "I experience symptoms such as " +
                        allergyModel.setSymptomsExperienced(symptomExperienced) + " " +
                "I also have allergies to " +
                        allergyModel.setMedicationAllergy(medicationAllergy) + " " +
                "in addition, " +
                        allergyModel.setAdditionalNotes(additionalNotes) + " " +
                "Please advise on managing these allergies according to the instructions provided.. " +
                "Your response should follow this format: " +
                "1. Give me immediate home procedures to follow in order to manage the allergy'. " +
                "2. Go ahead to recommend internationally accepted allergy management medical prescriptions to solve my allergy. " +
                "3. And advice me to seek medical attention if the prescriptions or home remedies did not work for me";

        return allergyService.allergyAiChatResponse(message);
    }
}
