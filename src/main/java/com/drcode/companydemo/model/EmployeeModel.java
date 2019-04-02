package com.drcode.companydemo.model;

public class EmployeeModel {

	private Integer id;
	private String firstName;
	private String lastName;
	private String department;
	private String email;

	
	
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public EmployeeModel(Integer id, String firstName, String lastName, String department, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.email = email;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
