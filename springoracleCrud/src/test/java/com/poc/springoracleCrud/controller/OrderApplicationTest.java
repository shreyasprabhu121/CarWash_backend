package com.poc.springoracleCrud.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.poc.springoracleCrud.controller.OrderController;
import com.poc.springoracleCrud.pojo.Order;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderApplicationTest {
	
	@Autowired
	OrderController ordercon;
	
	@Test
	public void getallTest() {
		assertNotNull(ordercon.getAllOrders());
	}
	
	@Test
	public void addorderTest() {
		Order order=new Order("sampleorder",788,"desc","testuser");
		assertNotNull(ordercon.addOrder(order));
	}
	
	@Test
	public void getbynameTest() {
		assertNotNull(ordercon.findOrdersByName("Shreyas"));
	}
}
