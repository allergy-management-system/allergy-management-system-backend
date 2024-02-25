package com.Allergy.AllergyApp.allergy.controller;

import com.Allergy.AllergyApp.allergy.service.AllergyService;
import com.Allergy.AllergyApp.allergy.model.Allergy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/allergies")
public class AllergyController {
    private final AllergyService allergyService;

    @Autowired
    public AllergyController(AllergyService allergyService) {

        this.allergyService = allergyService;
    }

    @GetMapping
    public ResponseEntity<List<Allergy>> getAllAllergies() {
        List<Allergy> allergies = allergyService.getAllAllergies();
        return new ResponseEntity<>(allergies, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Allergy> getAllergyById(@PathVariable String id) {
        Optional<Allergy> allergy = allergyService.getAllergyById(id);
        return allergy.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Allergy> createAllergy(@RequestBody Allergy allergy) {
        Allergy createdAllergy = allergyService.createAllergy(allergy);
        return new ResponseEntity<>(createdAllergy, HttpStatus.CREATED);
    }

    @PostMapping("/assessment")
    public ResponseEntity<String> submitAllergyAssessment(@RequestBody Allergy allergy) {
        // Here, you can handle the allergy assessment form submission
        // For now, let's just print the received data
        System.out.println("Received allergy assessment data: " + allergy);
        return new ResponseEntity<>("Allergy assessment submitted successfully", HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Allergy> updateAllergy(@PathVariable String id, @RequestBody Allergy allergy) {
        Allergy updatedAllergy = allergyService.updateAllergy(id, allergy);
        if (updatedAllergy != null) {
            return new ResponseEntity<>(updatedAllergy, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAllergy(@PathVariable String id) {
        allergyService.deleteAllergy(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
