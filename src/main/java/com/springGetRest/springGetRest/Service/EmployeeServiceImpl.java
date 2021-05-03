package com.springGetRest.springGetRest.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springGetRest.springGetRest.Repository.EmloyeeRepository;
import com.springGetRest.springGetRest.entity.Employee;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
	
//	List<Employee> list;
//	public EmployeeServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Employee(12,"Arpita","Dhar","arpitadhar@gmail.com","hydrabad","female",21,9099099) );
//		list.add(new Employee(13,"Priyanka","Muthiyalla","priyanka@gmail.com","hydrabad","female",21,9099099) );
//		list.add(new Employee(14,"abiita","Dhar","arpitadhar@gmail.com","hydrabad","female",21,9099099) );
//	}
	@Autowired
	private EmloyeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	@Override
	public Optional<Employee> getEmployee(long id) {
		return employeeRepository.findById(id);
	} 
	@Override
	public Employee addEmployee( Employee emp) {
		
		return employeeRepository.save(emp) ;
     }

}
