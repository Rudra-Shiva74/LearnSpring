package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;
import com.springboot.service.EmpServiceInterface;

@RestController
@RequestMapping("/")
public class EmpController {

	@Autowired
	private EmpServiceInterface empService;

	@GetMapping("/employee")
	public List<Employee> getAllEmployees() {
		return empService.getAllEmployees();
	}

	@PostMapping("/employee")
	public Employee creatEmployee(@RequestBody Employee employee) {
		return empService.savEmployee(employee);
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		empService.deleteEmployee(id);
		return "Delete user id : " + id;
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") int id) {
		Employee employee = this.empService.getEmployee(id);
		return employee;
	}

	@GetMapping("/byname/{name}")
	public Employee getByName(@PathVariable("name") String name) {
		System.out.println(name);
		Employee employee = this.empService.findbyNamEmployee(name);
		return employee;
	}

	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.empService.updatEmployee(employee);
	}

	@GetMapping("/about")
	public String about() {
		return "about";
	}
}
