package com.carwash.customersignup.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.customersignup.model.CustomerModel;
import com.carwash.customersignup.repository.CustomerRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerSignupController {

	@Autowired
	CustomerRepository customerRepo;

	@PostMapping("/customer/signup")
	public CustomerModel customerSignup(@RequestBody CustomerModel signupRequestData) {
		List<CustomerModel> alldata = new ArrayList<>();
		int i = 0;
		customerRepo.findAll().forEach(alldata::add);
		CustomerModel _customer = null;
		for (CustomerModel customer : alldata) {
			if (signupRequestData.getEmailId().equals(customer.getEmailId())) {
				i++;
			}
		}
		if (i == 0) {
			_customer = customerRepo.save(signupRequestData);
		}
		return _customer;

	}

}
