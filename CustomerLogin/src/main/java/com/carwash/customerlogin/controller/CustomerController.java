package com.carwash.customerlogin.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.customerlogin.model.CustomerModel;
import com.carwash.customerlogin.repository.CustomerRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	CustomerRepo customerRepo;
	
	@PostMapping("/customer/login")
	public CustomerModel customerLogin(@RequestBody CustomerModel loginRequestData ) {
		List<CustomerModel> customers=customerRepo.findAll();
		for (CustomerModel customerModel : customers) {
			if(loginRequestData.getEmailId().equals(customerModel.getEmailId())&&loginRequestData.getPassword().equals(customerModel.getPassword())) {
				return customerModel;
			}
		}
		return null;
	}
}
