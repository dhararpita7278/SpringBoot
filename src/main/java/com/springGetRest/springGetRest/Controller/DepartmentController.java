package com.springGetRest.springGetRest.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springGetRest.springGetRest.Service.DepartmentServiceImpl;
import com.springGetRest.springGetRest.entity.Department;

@RestController
public class DepartmentController extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	@Autowired
	private DepartmentServiceImpl departmentService;

	@GetMapping("/department")

	public List<Department> getAllDepartment() {
		return this.departmentService.getAllDepartment();
	}

	@PostMapping("/dep")
	public Department addDepartment(@RequestBody Department dept) {
		return this.departmentService.addDepartment(dept);
		
		}

	}
//}
