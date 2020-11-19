package com.poc.springoracleCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.springoracleCrud.model.CustomerModel;
import com.poc.springoracleCrud.model.OrderModel;
import com.poc.springoracleCrud.pojo.Order;
import com.poc.springoracleCrud.repo.OrderRepository;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	private static final org.slf4j.Logger LOGGER = 
		    org.slf4j.LoggerFactory.getLogger(OrderController.class);
	
	
	@Autowired
	OrderRepository repo;
	
	@GetMapping("/getAll")
	public List<OrderModel> getAllOrders() {
		LOGGER.info("Retrieving all orders");
		return repo.findAll();
	}
	
	@PostMapping("/addorder")
	public OrderModel addOrder(@RequestBody Order order) {
		OrderModel orderModel=new OrderModel();
		orderModel.setOrderName(order.getOrderName());
		orderModel.setPrice(order.getPrice());
		orderModel.setDescription(order.getDescription());
		orderModel.setUserName(order.getUserName());
		LOGGER.info("New Order details added {}",orderModel);
		return repo.save(orderModel);
	}
	
	@GetMapping("/getbyname/{name}")
	public List<OrderModel> findOrdersByName(@PathVariable("name") String name) {
		LOGGER.info("Retrieving order data with username {}",name);
		return repo.getOrderByName(name);
	}
	
	@GetMapping("/getbyjoins")
	public List<OrderModel> findOrdersByJoins() {
		LOGGER.info("Retrieving order data with joins");
		return repo.getOrderByjoins();
	}
	
	@GetMapping("/getcount")
	public int getOrderCount() {
		LOGGER.info("Retrieving order count");
		return repo.getOrderCount();
	}
}
