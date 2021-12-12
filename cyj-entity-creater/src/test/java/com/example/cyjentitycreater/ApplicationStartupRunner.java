package com.example.cyjentitycreater;

import org.springframework.boot.CommandLineRunner;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

//@Component
public class ApplicationStartupRunner implements CommandLineRunner {

        private final MessageChannel greet;

        public ApplicationStartupRunner(MessageProvider binding) {
                greet = binding.greeting();
        }

        @Override
        public void run(String... args) {
                interFaceHandler();
        }

        private void interFaceHandler() {
                Message<String> msg = MessageBuilder.withPayload("").build();
                this.greet.send(msg);
        }

}