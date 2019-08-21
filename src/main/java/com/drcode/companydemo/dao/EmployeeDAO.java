package com.drcode.companydemo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.drcode.companydemo.entity.Employee;
import com.drcode.companydemo.enumerate.Gender;

public interface EmployeeDAO extends CrudRepository<Employee, Long> {
	
	Employee findById(Integer id);
	
	List<Employee> findByTitle(String title);
	
	Employee findByEmail(String email);
	
	List<Employee> findByTitleAndGender(String title, Gender gender);
	
}
