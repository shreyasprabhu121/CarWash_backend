package com.poc.springoracleCrud.repo;


import java.util.List;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.poc.springoracleCrud.genericRepo.JpaSpecificationRepository;
import com.poc.springoracleCrud.model.CustomerModel;


@Repository
public interface PocRepository extends JpaSpecificationRepository<CustomerModel, Long> { 
	
	@Query(value = "SELECT c FROM CustomerModel c WHERE c.name = :name")
	public List<CustomerModel> findByNamedQuery( String name );
}
