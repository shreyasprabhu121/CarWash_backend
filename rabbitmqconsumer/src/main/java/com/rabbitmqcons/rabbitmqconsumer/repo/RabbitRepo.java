package com.rabbitmqcons.rabbitmqconsumer.repo;

import org.springframework.data.repository.CrudRepository;

import com.rabbitmqcons.rabbitmqconsumer.entity.CustomerEntity;

public interface RabbitRepo extends CrudRepository<CustomerEntity, Long> {

}
