package com.scme.service.pringboot_activemq.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProducerApp {
    public static void main(String[] args) {
		SpringApplication.run(ProducerApp.class, args);
	}
}
