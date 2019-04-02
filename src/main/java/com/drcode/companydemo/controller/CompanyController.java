package com.drcode.companydemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drcode.companydemo.model.EmployeeModel;
import com.drcode.companydemo.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(value = "ping", method = RequestMethod.GET)
	public ResponseEntity<String> test() {
		return new ResponseEntity<>(new String("pong"), HttpStatus.OK);

	}

	@RequestMapping(value = "get/employee/example", method = RequestMethod.GET)
	public ResponseEntity<EmployeeModel> getExampleEmployee() {
		EmployeeModel employee = companyService.getEmployeeExample();
		return new ResponseEntity<>(employee, HttpStatus.OK);

	}
}
