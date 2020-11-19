package com.rabbitmqcons.rabbitmqconsumer.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public interface RabbitListnerInterface<T> {
	
	@RabbitListener(queues = "${rabbitpoc.rabbitmq.queue}", id = "cus",autoStartup = "false")
	public void rabbitListener(T object);

}
