package com.poc.springoracleCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.springoracleCrud.repo.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository repository;
	
	public int getCount() {
		return repository.getOrderCount();
	}

}
