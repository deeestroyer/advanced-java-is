package edu.wgu.d387_sample_code.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class welcomeMsgController {
    @GetMapping("/welcomeEN")
    public String getWelcomeMessageEnglish() {

        welcomeMsgMultiThreading response = new welcomeMsgMultiThreading();
        response.loadWelcomeMessages();

        return response.getEnglishWelcomeMessage();
    }

    @GetMapping("/welcomeFR")
    public String getWelcomeMessageFrench() {

        welcomeMsgMultiThreading response = new welcomeMsgMultiThreading();
        response.loadWelcomeMessages();

        return response.getFrenchWelcomeMessage();
    }
}