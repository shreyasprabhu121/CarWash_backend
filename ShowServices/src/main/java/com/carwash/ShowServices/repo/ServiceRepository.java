package com.carwash.ShowServices.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.ShowServices.model.ServiceModel;

public interface ServiceRepository extends MongoRepository<ServiceModel, String> {

}
