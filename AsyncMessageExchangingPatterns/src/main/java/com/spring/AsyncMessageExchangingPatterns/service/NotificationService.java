package com.spring.AsyncMessageExchangingPatterns.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class NotificationService {

    @Async
    public void sendTextMessage(String mobile) {
        sleep(2);
        System.out.println("called 3rd party to send text message : " + Thread.currentThread().getName());
        System.out.println(10 / 0);

    }


    private void sleep(int args) {
        try {
            TimeUnit.SECONDS.sleep(args);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
