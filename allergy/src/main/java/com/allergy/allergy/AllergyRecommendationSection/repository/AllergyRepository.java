package com.allergy.allergy.AllergyRecommendationSection.repository;

import com.allergy.allergy.AllergyRecommendationSection.model.AllergyModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AllergyRepository extends MongoRepository<AllergyModel, String> {

}
