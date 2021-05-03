package com.springGetRest.springGetRest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springGetRest.springGetRest.entity.Employee;

@Repository
public interface EmloyeeRepository  extends JpaRepository<Employee, Long>{
   
}
