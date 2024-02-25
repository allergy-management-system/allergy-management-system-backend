package com.Allergy.AllergyApp.allergy.repository;

import com.Allergy.AllergyApp.allergy.model.Allergy;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllergyRepository extends MongoRepository<Allergy, String> {
}
