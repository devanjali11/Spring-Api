package com.example.demoAPI.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demoAPI.entity.employee;

public interface employeeRepo extends CrudRepository<employee,Integer> {
	
	

}
