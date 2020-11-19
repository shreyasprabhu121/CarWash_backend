package com.poc.springoracleCrud.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.poc.springoracleCrud.pojo.Customer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PocControllerTest {

	@Autowired
	PocController controller;
	
	@Test
	public void addCustomerTest() {
		Customer model=new Customer(1,"hello",56,"abc");
		assertNotNull(controller.addCustomer(model));
		
	}
	
	@Test
	public void findbyNameTest() {
		assertNotNull(controller.findByName("hello"));
	}
	
	@Test
	public void updateTest() {
		Customer model=new Customer(38,"hello",56,"kkk");
		assertNotNull(controller.updateCsutomer(model));
	}
	
	@Test
	public void getAlltest() {
		assertNotNull(controller.getAll());
	}
	
	@Test
	public void findbynameTest() {
		assertNotNull(controller.getById(24));
	}
	
	@Test
	public void updatebyIDAlternateTest()
	{
		Customer model=new Customer(389,"hello",56,"kkk");
		assertNotNull(controller.updateCsutomer(model));
	}

}
