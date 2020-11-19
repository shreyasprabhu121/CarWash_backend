package com.carwash.customerlogin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.customerlogin.model.CustomerModel;

public interface CustomerRepo extends  MongoRepository<CustomerModel, String> {

}
