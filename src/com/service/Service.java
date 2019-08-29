package com.service;

import java.util.List;

import com.models.Admin;
import com.models.Customer;
import com.models.Driver;

public interface Service {
	public String addCustomer(Customer customer);
	public String addDriver(Driver driver);
	public String UpdateCustomer(Customer customer);
	public String deleteCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public List<Driver> getAllDriver();
	public List<Admin> getAllAdmin();
	public List<String> getAllLocations();
}
