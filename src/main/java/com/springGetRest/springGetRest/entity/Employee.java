package com.springGetRest.springGetRest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeeA")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "Name")
	private String Name;
	@Column(name = "age")
	private int age;
	@Column(name = "mobileNo")
	private int mobileNo;
	@Column(name = "DOB")
	private String DOB;
	@Column(name = "address")
	private String address;
	 @ManyToOne
	 @JoinColumn(name ="FK_departmentId")
	  private Department dept;
	public Employee() {}
	

	public Employee(long id, String name, int age, int mobileNo, String dOB, String address) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		DOB = dOB;
		this.address = address;
	}


	public long getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public int getAge() {
		return age;
	}
	public String getDOB() {
		return DOB;
	}
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
