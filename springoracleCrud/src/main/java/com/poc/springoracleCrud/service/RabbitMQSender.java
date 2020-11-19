package com.poc.springoracleCrud.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.poc.springoracleCrud.pojo.Customer;


@Service
public class RabbitMQSender {
	
	private static final org.slf4j.Logger LOGGER = 
		    org.slf4j.LoggerFactory.getLogger(RabbitMQSender.class);

	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${rabbitpoc.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${rabbitpoc.rabbitmq.routingkey}")
	private String routingkey;	
	
	public void send(Customer company) {
		rabbitTemplate.convertAndSend(exchange, routingkey, company);
		LOGGER.info("Send msg: {} ",company);
	    
	}
}
