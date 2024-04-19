package com.auth.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.auth.model.Customer;
import com.auth.service.CusService;

@RestController
public class CusController {
	@Autowired
	private CusService service;

	@GetMapping("/customer")
	public List<Customer> getAlList() {
		return this.service.getAlList();
	}

	@GetMapping("/customer/{username}")
	public Customer getOne(@PathVariable("username") String username) {
		return this.service.getCustomer(username);
	}

	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return this.service.addCustomer(customer);
	}

	@GetMapping("/index")
	public String index() {
		return "Index";
	}

}
