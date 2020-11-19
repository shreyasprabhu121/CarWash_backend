package com.rabbitmqcons.rabbitmqconsumer.service;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.rabbitmqcons.rabbitmqconsumer.config.RabbitListnerInterface;
import com.rabbitmqcons.rabbitmqconsumer.entity.CustomerEntity;
import com.rabbitmqcons.rabbitmqconsumer.model.Customer;
import com.rabbitmqcons.rabbitmqconsumer.repo.RabbitRepo;

@Component
public class RabbitMQConsumer implements RabbitListnerInterface<Customer> {

	private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(RabbitMQConsumer.class);

	@Autowired
	RabbitRepo repo;

	@Autowired
	RabbitListenerEndpointRegistry registry;

//	@RabbitListener(queues = "${rabbitpoc.rabbitmq.queue}", id = "cus", autoStartup = "false")
//	public void rabbitListener(Customer employee) {
//		CustomerEntity cus = new CustomerEntity();
//		cus.setAge(employee.getAge());
//		cus.setCity(employee.getCity());
//		cus.setId(employee.getId());
//		cus.setName(employee.getName());
//		repo.save(cus);
//		LOGGER.info("Recieved Message From RabbitMQ:{} ", employee);
//	}

	@Scheduled(cron = "0 08 15 ? * *")
	public void enableRabbitlistener() {
		registry.getListenerContainer("cus").start();
	}

	@Override
	public void rabbitListener(Customer employee) {
		CustomerEntity cus = new CustomerEntity();
		cus.setAge(employee.getAge());
		cus.setCity(employee.getCity());
		cus.setId(employee.getId());
		cus.setName(employee.getName());
		repo.save(cus);
		LOGGER.info("Recieved Message From RabbitMQ:{} ", employee);

	}

}
