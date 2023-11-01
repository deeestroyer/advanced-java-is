package edu.wgu.d387_sample_code.controller;

import lombok.Getter;
import lombok.Setter;

import java.util.Locale;
import java.util.ResourceBundle;

@Getter
@Setter
public class welcomeMsgMultiThreading extends Thread{
    private String englishWelcomeMessage;
    private String frenchWelcomeMessage;

    public void loadWelcomeMessages() {
        Thread englishThread = new Thread(() -> {
            ResourceBundle message = ResourceBundle.getBundle("lang", new Locale("en", "US"));
            englishWelcomeMessage = message.getString("hello");
        });

        Thread frenchThread = new Thread(() -> {
            ResourceBundle messages = ResourceBundle.getBundle("lang", new Locale("fr", "CA"));
            frenchWelcomeMessage = messages.getString("hello");
        });

        englishThread.start();
        frenchThread.start();

        try {
            englishThread.join();
            frenchThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
