package com.drcode.companydemo.service.impl;

import org.springframework.stereotype.Service;

import com.drcode.companydemo.model.EmployeeModel;
import com.drcode.companydemo.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Override
	public EmployeeModel getEmployeeExample() {
		EmployeeModel employee = new EmployeeModel();

		employee.setId(1001);
		employee.setDepartment("Computer Science");
		employee.setFirstName("Patrick");
		employee.setLastName("Li");
		employee.setEmail("Patrick.Li@gmail.com");
		return employee;
	}

}
