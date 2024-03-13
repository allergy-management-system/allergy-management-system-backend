package com.allergy.allergy.AllergyRecommendationSection.controllers;

import com.allergy.allergy.AllergyRecommendationSection.aiResponseInstruction.AiResponseInstruction;
import com.allergy.allergy.AllergyRecommendationSection.model.Allergy;
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
    public Object ChatDiscussion(
            @RequestParam String userId,
            String peanuts,
            String fish,
            String eggs,
            String butter,
            String soyProducts,
            String milk,
            String otherNuts,
            String sugar,
            String mushrooms,
            String gluten,
            String mustard,
            String otherFoods,
            String timesOfReaction,
            String lastReaction,
            String causeOfReaction,
            String symptomExperienced,
            String medicationAllergy,
            String additionalNotes
    ) throws IOException {
        //Initialize the allergy model:
        Allergy allergyModel = new Allergy();
        AiResponseInstruction aiResponseInstruction = new AiResponseInstruction();
        String message =
                aiResponseInstruction.getStartInstructions() +
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
                        allergyModel.setAdditionalNotes(additionalNotes) +
                aiResponseInstruction.getEndInstructions();

        return allergyService.allergyAiChatResponse(userId, message.trim());
    }

    //The allergy history endpoint
    @PostMapping("/history")
    public Object[] AllergyHistory(@RequestParam String userId) {
        return allergyService.allergyHistory(userId);
    }
}
