package com.carwash.ShowServices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.ShowServices.model.ServiceModel;
import com.carwash.ShowServices.repo.ServiceRepository;

@RestController
@RequestMapping("/api")
public class GetServiceController {

	@Autowired
	ServiceRepository serviceRepo;
	
	@GetMapping("/service/getservice")
	public List<ServiceModel> getServices(){
		List<ServiceModel> allServices=new ArrayList<>();
		serviceRepo.findAll().forEach(allServices::add);
		return allServices;
	}
}
