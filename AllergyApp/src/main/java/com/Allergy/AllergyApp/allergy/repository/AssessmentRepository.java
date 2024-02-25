package com.Allergy.AllergyApp.allergy.repository;

import com.Allergy.AllergyApp.allergy.model.Assessment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentRepository extends MongoRepository<Assessment, String>{
}
