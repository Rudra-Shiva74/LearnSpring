package com.auth.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.auth.model.Customer;

@Service
public class CusService {
	List<Customer> list = new ArrayList<>();

	public CusService() {
		list.add(new Customer("Abhishek1", "1234", "abh@gmail.com"));
		list.add(new Customer("Abhishek2", "1234", "abh@gmail.com"));
		list.add(new Customer("Abhishek3", "1234", "abh@gmail.com"));
	}

	public List<Customer> getAlList() {
		return this.list;
	}

	public Customer getCustomer(String username) {
		return this.list.stream().filter((customer) -> customer.getUsername().equals(username)).findAny().orElse(null);
	}

	public Customer addCustomer(Customer customer) {
		this.list.add(customer);
		return customer;
	}
}
