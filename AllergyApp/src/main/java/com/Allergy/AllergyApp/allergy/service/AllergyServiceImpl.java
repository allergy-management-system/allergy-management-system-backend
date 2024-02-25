//package com.Allergy.AllergyApp.service;
//
//import com.Allergy.AllergyApp.model.Allergy;
//import com.Allergy.AllergyApp.repository.AllergyRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class AllergyServiceImpl extends AllergyService {
//
//    private final AllergyRepository allergyRepository;
//
//    @Autowired
//    public AllergyServiceImpl(AllergyRepository allergyRepository) {
//        super();
//        this.allergyRepository = allergyRepository;
//    }
//
//    @Override
//    public List<Allergy> getAllAllergies() {
//        return allergyRepository.findAll();
//    }
//
//    @Override
//    public Optional<Allergy> getAllergyById(Long id) {
//        return allergyRepository.findById(id);
//    }
//
//    @Override
//    public Allergy saveAllergy(Allergy allergy) {
//        return allergyRepository.save(allergy);
//    }
//
//    @Override
//    public void deleteAllergyById(Long id) {
//        allergyRepository.deleteById(id);
//    }
//}
