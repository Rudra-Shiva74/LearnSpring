package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.model.Employee;

@Service
public interface EmpServiceInterface {
	public Employee savEmployee(Employee employee);

	public Employee updatEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployee(int id);

	public void deleteEmployee(int id);

	public Employee findbyNamEmployee(String name);

}
