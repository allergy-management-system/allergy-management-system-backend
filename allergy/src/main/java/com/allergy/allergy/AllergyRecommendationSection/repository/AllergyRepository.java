package com.allergy.allergy.AllergyRecommendationSection.repository;

import com.allergy.allergy.AllergyRecommendationSection.model.Allergy;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface AllergyRepository extends MongoRepository<Allergy, String> {
    List<Allergy> findAllByUserId(String userId);
    Optional<Allergy> findByUserId(String userId);
}
