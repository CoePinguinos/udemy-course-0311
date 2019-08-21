package com.drcode.companydemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drcode.companydemo.dao.EmployeeDAO;
import com.drcode.companydemo.entity.Employee;
import com.drcode.companydemo.model.EmployeeModel;
import com.drcode.companydemo.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public EmployeeModel getEmployeeExample() {
	
		EmployeeModel em = new EmployeeModel();

		
		Employee e = employeeDAO.findById(100);
		em.setDepartment(e.getDepartment().getName());
		
		String[] names = e.getName().split(" ");
		
		em.setFirstName(names[0]);
		em.setLastName(names[1]);
		return em;
		
	}

}
