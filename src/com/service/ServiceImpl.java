package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.DAO;
import com.dao.DAOImpl;
import com.models.Admin;
import com.models.Customer;
import com.models.Driver;

public class ServiceImpl implements Service{
	DAO dao=new DAOImpl();
	
	@Override
	public String addCustomer(Customer customer) {
		String result=null;
		try {
			result=dao.addCustomer(customer);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public String addDriver(Driver driver) {
		String result=null;
		try {
			result=dao.addDriver(driver);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String UpdateCustomer(Customer customer) {
		String result=null;
		try {
			result=dao.UpdateCustomer(customer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/* public boolean UpdateCustomer(Customer c) throws Exception
	 * {
	 * 		boolean flag=dao.UpdateCustomer(customer);
	 * 		return flag;
	 * }
	 */

	@Override
	public String deleteCustomer(Customer customer) {
		String result=null;
		try {
			result=dao.deleteCustomer(customer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> list=null;
		try {
			list=dao.getAllCustomer();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Driver> getAllDriver() {
		List<Driver> list=null;
		try {
			list=dao.getAllDriver();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Admin> getAllAdmin() {
		List<Admin> list=null;
		try {
			list=dao.getAllAdmin();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<String> getAllLocations() {
		List<String> list=null;
		try {
			list=dao.getAllLocations();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
