package com.freemanpivo.chassi.web;

import com.freemanpivo.chassi.domain.port.RetrieveUserStored;
import com.freemanpivo.chassi.domain.usecase.GetUserDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TemplateApplicationConfiguration {

    @Bean
    GetUserDetails getUserDetails(RetrieveUserStored retrieveUserStored) {
        return new GetUserDetails(retrieveUserStored);
    }

}
