package com.rabbitmqcons.rabbitmqconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@SpringBootApplication
@EnableScheduling
public class RabbitmqconsumerApplication {
	
	public static void main(String args[]) {
		SpringApplication.run(RabbitmqconsumerApplication.class, args);
	}
	

}
