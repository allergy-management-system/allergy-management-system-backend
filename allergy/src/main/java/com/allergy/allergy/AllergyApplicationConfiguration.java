package com.allergy.allergy;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AllergyApplicationConfiguration {
    public AllergyApplicationConfiguration() {
        System.setProperty("GOOGLE_APPLICATION_CREDENTIALS", "/allergy-management-service-843d91d86665.json");
    }
}
