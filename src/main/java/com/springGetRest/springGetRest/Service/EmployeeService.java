package com.springGetRest.springGetRest.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.springGetRest.springGetRest.entity.Employee;

public interface EmployeeService {

	 public List<Employee> getAllEmployee();

	public Optional<Employee> getEmployee(long id);

   public Employee addEmployee(Employee emp);

}
