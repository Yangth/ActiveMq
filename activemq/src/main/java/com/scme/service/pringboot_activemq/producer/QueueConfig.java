package com.scme.service.pringboot_activemq.producer;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {
    @Value("${queue}")
	private String queue;

	@Bean
	public ActiveMQQueue logQueue() {
		return new ActiveMQQueue(queue);
	}
}
