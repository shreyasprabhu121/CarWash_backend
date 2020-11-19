package com.carwash.AddServices.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.AddServices.model.ServiceModel;

public interface ServiceRepository extends MongoRepository<ServiceModel, String> {

}
