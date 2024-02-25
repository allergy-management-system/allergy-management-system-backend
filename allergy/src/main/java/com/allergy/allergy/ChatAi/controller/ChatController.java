package com.allergy.allergy.ChatAi.controller;

import com.allergy.allergy.ChatAi.chatRequest.ChatRequest;
import com.allergy.allergy.ChatAi.chatResponse.ChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ChatController {

    @Qualifier("openaiRestTemplate")
    @Autowired
    private RestTemplate restTemplate;

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiURL;

    @GetMapping("/chat")
    public String chat(@RequestParam String prompt) {
        //create a request
        ChatRequest chatRequest = new ChatRequest(model, prompt);

        //call the chat api
        ChatResponse chatResponse = restTemplate.postForObject(apiURL, chatRequest, ChatResponse.class);

        if (chatResponse == null || chatResponse.getChoices() == null || chatResponse.getChoices().isEmpty()) {
            return "No response";
        }

        //return the response
        return chatResponse.getChoices().get(0).getMessage().getContent();
    }
}
