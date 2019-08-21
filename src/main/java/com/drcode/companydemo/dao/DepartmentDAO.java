package com.drcode.companydemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.drcode.companydemo.entity.Department;

public interface DepartmentDAO extends CrudRepository<Department, Long> {
	void deleteById(Integer id);
}
