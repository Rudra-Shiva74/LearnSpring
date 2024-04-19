package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.model.Employee;
import com.springboot.reposetory.EmpRepo;

@Component
public class EmpService implements EmpServiceInterface {

	@Autowired
	private EmpRepo empRepo;

	@Override
	public Employee savEmployee(Employee employee) {
		Employee emp = null;
		try {
			emp = this.empRepo.save(employee);
		} catch (Exception e) {
			throw new RuntimeException("Employee Allready Exist with id : " + employee.getId());
		}
		return emp;
	}

	@Override
	public Employee updatEmployee(Employee employee) {
		if (empRepo.existsById(employee.getId())) {
			return this.empRepo.saveAndFlush(employee);
		}
		throw new RuntimeException("No Employee Exist with id : " + employee.getId());
	}

	@Override
	public List<Employee> getAllEmployees() {
		return this.empRepo.findAll();
	}

	@Override
	public Employee getEmployee(int id) {
		Optional<Employee> employeeOptional = empRepo.findById(id);
		if (employeeOptional.isPresent()) {
			return employeeOptional.get();
		} else {
			throw new RuntimeException("Employee not found with id: " + id);
		}
	}

	@Override
	public void deleteEmployee(int id) {
		if (!empRepo.existsById(id)) {
			throw new RuntimeException("Employee not found with id to delete: " + id);
		}
		empRepo.deleteById(id);
	}

	@Override
	public Employee findbyNamEmployee(String name) {
		Employee employees = this.empRepo.findByName(name);
		return employees;
	}

}
