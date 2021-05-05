package com.springGetRest.springGetRest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departmentAA")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "DepartmentName")
	private String departmentName;
	
	

	public long getId() {
		return id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Department(long id, String departmentName) {
		this.id = id;
		this.departmentName = departmentName;
	}

	public Department() {
	}

}
