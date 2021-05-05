package com.springGetRest.springGetRest.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springGetRest.springGetRest.Repository.EmloyeeRepository;
import com.springGetRest.springGetRest.entity.Employee;

@Service
public class EmployeeServiceImpl {
	@Autowired
	private EmloyeeRepository employeeRepository;
	// select
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	public Optional<Employee> getEmployee(long id) {
		return employeeRepository.findById(id);
	}
	public Employee addEmployee(Employee emp) {

		return employeeRepository.save(emp);
	}
	public Employee deleteEmployee(long id) {
		Employee entity = employeeRepository.getOne(id);
		employeeRepository.delete(entity);
		return entity;

	}
}
