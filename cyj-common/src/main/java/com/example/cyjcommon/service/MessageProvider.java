package com.example.cyjcommon.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageProvider {

        @Output("greetingChannel")
        MessageChannel greeting();

}
