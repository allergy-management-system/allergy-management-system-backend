package com.Allergy.AllergyApp.allergy.controller;

import com.Allergy.AllergyApp.allergy.service.AssessmentService;
import com.Allergy.AllergyApp.allergy.model.Assessment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/assessments")
public class AssessmentController {
    private final AssessmentService assessmentService;

    @Autowired
    public AssessmentController (AssessmentService assessmentService) {
        this.assessmentService = assessmentService;
    }

    @PostMapping
    public ResponseEntity<Assessment> createAssessment(@RequestBody Assessment assessment) {
        Assessment createdAssessment = assessmentService.createAssessment(assessment);
        return new ResponseEntity<>(createdAssessment, HttpStatus.CREATED);
    }
}
