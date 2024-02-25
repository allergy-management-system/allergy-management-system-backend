package com.Allergy.AllergyApp.allergy.service;

import com.Allergy.AllergyApp.allergy.model.Allergy;
import com.Allergy.AllergyApp.allergy.repository.AllergyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AllergyService {
    private final AllergyRepository allergyRepository;

    @Autowired
    public AllergyService(AllergyRepository allergyRepository) {

        this.allergyRepository = allergyRepository;
    }

    public List<Allergy> getAllAllergies() {

        return allergyRepository.findAll();
    }

    public Optional<Allergy> getAllergyById(String id) {
        return allergyRepository.findById(id);
    }

    public Allergy createAllergy(Allergy allergy) {

        return allergyRepository.save(allergy);
    }

    public Allergy updateAllergy(String id, Allergy updatedAllergy) {
        Optional<Allergy> existingAllergyOptional = allergyRepository.findById(id);
        if (existingAllergyOptional.isPresent()) {
            Allergy existingAllergy = existingAllergyOptional.get();
            existingAllergy.setName(updatedAllergy.getName());
            existingAllergy.setSeverity(updatedAllergy.getSeverity());
            existingAllergy.setReaction(updatedAllergy.getReaction());
            existingAllergy.setDiagnosisDate(updatedAllergy.getDiagnosisDate());
            existingAllergy.setTimestamp(updatedAllergy.getTimestamp());
            return allergyRepository.save(existingAllergy);
        } else {
            return null;
        }
    }

    public void deleteAllergy(String id) {

        allergyRepository.deleteById(id);
    }
}
