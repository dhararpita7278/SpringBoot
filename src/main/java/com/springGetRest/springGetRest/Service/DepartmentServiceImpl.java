package com.springGetRest.springGetRest.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springGetRest.springGetRest.Repository.DepartmentRepository;
import com.springGetRest.springGetRest.entity.Department;

@Service
public class DepartmentServiceImpl {
	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Department> getAllDepartment() {
		return departmentRepository.findAll();
	}

	public Department addDepartment(Department dept) {
		return departmentRepository.save(dept);
	}

}
