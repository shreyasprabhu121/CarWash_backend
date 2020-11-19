package com.carwash.AddServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.AddServices.model.ServiceModel;
import com.carwash.AddServices.repo.ServiceRepository;

@RestController
@RequestMapping("/api")
public class ServiceController {

	@Autowired
	ServiceRepository serviceRepo;
	
	@PostMapping("/service/addservice")
	public ServiceModel addService(@RequestBody ServiceModel addServiceRequestdata) {
		ServiceModel _addedService=serviceRepo.insert(addServiceRequestdata);
		return _addedService;
	}
}
