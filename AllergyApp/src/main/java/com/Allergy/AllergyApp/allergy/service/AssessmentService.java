package com.Allergy.AllergyApp.allergy.service;

import com.Allergy.AllergyApp.allergy.repository.AssessmentRepository;
import com.Allergy.AllergyApp.allergy.model.Assessment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssessmentService {
    private final AssessmentRepository assessmentRepository;

    @Autowired
    public AssessmentService(AssessmentRepository assessmentRepository) {
        this.assessmentRepository = assessmentRepository;
    }

    public Assessment createAssessment(Assessment assessment) {
        return assessmentRepository.save(assessment);
    }

    // Add other methods as needed
}
