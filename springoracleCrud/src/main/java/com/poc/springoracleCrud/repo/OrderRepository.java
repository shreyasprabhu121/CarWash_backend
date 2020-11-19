package com.poc.springoracleCrud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.poc.springoracleCrud.genericRepo.JpaSpecificationRepository;
import com.poc.springoracleCrud.model.OrderModel;

public interface OrderRepository extends JpaSpecificationRepository<OrderModel, Long> {

	@Query(value = "SELECT o FROM OrderModel o WHERE o.userName = :name")
	public List<OrderModel> getOrderByName( String name );
	
	@Query(nativeQuery = true,value = "SELECT * FROM orderdetailss o INNER JOIN "
			+ "customerdetails c ON c.customer_name=o.user_name")
	public List<OrderModel> getOrderByjoins();
	
	@Query(nativeQuery = true,value = "select count(order_id) as Id from orderdetailss")
	public int getOrderCount();
}
