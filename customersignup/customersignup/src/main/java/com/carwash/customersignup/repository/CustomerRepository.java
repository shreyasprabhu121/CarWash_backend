package com.carwash.customersignup.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.customersignup.model.CustomerModel;


public interface CustomerRepository extends  MongoRepository<CustomerModel, String> {

}
