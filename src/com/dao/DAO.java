package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.models.Admin;
import com.models.Customer;
import com.models.Driver;

public interface DAO {
	public String addCustomer(Customer customer) throws SQLException;
	public String addDriver(Driver driver) throws SQLException;
	public String UpdateCustomer(Customer customer) throws SQLException;
	public String deleteCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomer() throws SQLException;
	public List<Driver> getAllDriver() throws SQLException;
	public List<Admin> getAllAdmin() throws SQLException;
	public List<String> getAllLocations() throws SQLException;
}
