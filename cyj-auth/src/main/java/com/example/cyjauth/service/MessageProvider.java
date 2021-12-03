package com.example.cyjauth.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MessageProvider {

        @Input("greetingChannel")
        SubscribableChannel greeting();

}
