package com.springGetRest.springGetRest.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springGetRest.springGetRest.Service.EmployeeServiceImpl;
import com.springGetRest.springGetRest.entity.Employee;


@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl employeeService;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return this.employeeService.getAllEmployee() ;
	}
	@GetMapping("/emp/{id}")
	public Optional<Employee> getEmployee(@PathVariable long id) {
		return this.employeeService.getEmployee(id);
	}
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return this.employeeService.addEmployee(emp);
	}
	//delete
	@DeleteMapping("/emp/{id}")
	public Employee deleteEmployee(@PathVariable long id) {
		return this.employeeService.deleteEmployee(id);
	}
	/*//update
	public Employee updateEmployee(@PathVariable long id ) {
	return departmentService.updateEmployee(id);
	}*/
}
	

