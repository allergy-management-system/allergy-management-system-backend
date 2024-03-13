package com.allergy.allergy.AllergyRecommendationSection.aiResponseInstruction;

public class AiResponseInstruction {
    public String getStartInstructions() {
        return
            "Hi Gemini, I need your advice on allergy: Here are the that rules I want you to follow before giving an answer. " +
            "Rule 1. UserInput: " +
            "I have allergies to "
        ;
    }

    public String getEndInstructions() {
        return
            " Please advise on managing these allergies according to the instructions provided.. " +
            "Your response should follow this format: " +
            "1. Give me immediate home procedures to follow in order to manage the allergy'. " +
            "2. Go ahead to recommend internationally accepted allergy management medical prescriptions to solve my allergy, and their side effects. " +
            "3. And advice me to seek medical attention if the prescriptions or home remedies did not work for me" +
            "4. The headings should be in capital letters" +
            "5. Every new point should start two lines after the first one and remove the asterisks at the start and end of the points"
        ;
    }
}
