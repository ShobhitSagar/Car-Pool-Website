package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.models.Admin;
import com.models.Customer;
import com.models.Driver;



public class DAOImpl implements DAO{
	
	private static Connection con=null;
	public static Connection getCon() throws SQLException{
		String uname="root";
		String password="root";
		 String dbname = "carpool";
		String url="jdbc:mysql://localhost:8889/"+dbname;
		String driverClass="com.mysql.jdbc.Driver";
		try{
			Class.forName(driverClass);    
			con=DriverManager.getConnection(url,uname,password);
			System.out.println("connection ok");
		}catch(ClassNotFoundException e){
			System.out.println("driver loading...");
		}
		return con;
	}

	@Override
	public String addCustomer(Customer customer) throws SQLException {
		
		Connection con= getCon();
		String result="FAIL";
		PreparedStatement pst=null;
		String sql="insert into customer(id, name,email,password,contact) values(NULL,?,?,?,?)";
		pst=con.prepareStatement(sql);
		pst.setString(1, customer.getUname());
		pst.setString(2, customer.getPassword());
		pst.setString(3, customer.getEmail());
		pst.setLong(4, customer.getContact());
		int r=pst.executeUpdate();
		if(r>0){
			result="SUCCESS";
		}
		return result;
	}

	@Override
	public String addDriver(Driver driver) throws SQLException {
		
		Connection con= getCon();
		String result="FAIL";
		PreparedStatement pst=null;
		String sql="insert into driver(id, name,email,password,contact, licence) values(NULL,?,?,?,?,?)";
		pst=con.prepareStatement(sql);
		pst.setString(1, driver.getUname());
		pst.setString(2, driver.getPassword());
		pst.setString(3, driver.getEmail());
		pst.setLong(4, driver.getContact());
		pst.setString(5, driver.getLicence());
		int r=pst.executeUpdate();
		if(r>0){
			result="SUCCESS";
		}
		return result;
	}

	@Override
	public String UpdateCustomer(Customer customer) throws SQLException {

		Connection con= getCon();
		String result="FAIL";
		PreparedStatement pst=null;
		String sql="update customer set name=?,email=?,password=?,contact=? where id=?";
		pst=con.prepareStatement(sql);
		pst.setString(1, customer.getUname());
		pst.setString(2, customer.getPassword());
		pst.setString(3, customer.getEmail());
		pst.setLong(4, customer.getContact());
		pst.setInt(5, customer.getId());
		int r=pst.executeUpdate();
		if(r>0){
			result="SUCCESS";
		}
		return result;
	}

	@Override
	public String deleteCustomer(Customer customer) throws SQLException {

		Connection con= getCon();
		String result="FAIL";
		PreparedStatement pst=null;
		String sql="delete customer(id,name,email,password,contact) where id=?";
		pst=con.prepareStatement(sql);
		pst.setInt(1, customer.getId());
		int r=pst.executeUpdate();
		if(r>0){
			result="SUCCESS";
		}
		return result;
	}

	@Override
	public List<Customer> getAllCustomer() throws SQLException {

		Connection con= getCon();
		List<Customer> list=new ArrayList<Customer>();
		PreparedStatement pst=null;
		String sql="select * from customer";
		pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			Customer customer=new Customer();
			customer.setId(rs.getInt("id"));
			customer.setUname(rs.getString("name"));
			customer.setPassword(rs.getString("password"));
			customer.setEmail(rs.getString("email"));
			customer.setContact(rs.getInt("contact"));
			list.add(customer);
		}
		return list;
	}

	@Override
	public List<Driver> getAllDriver() throws SQLException {

		Connection con= getCon();
		List<Driver> list=new ArrayList<Driver>();
		PreparedStatement pst=null;
		String sql="select * from driver";
		pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
//		while(rs.next()){
//			Driver driver=new Driver();
//			driver.setId(rs.getInt("id"));
//			customer.setUname(rs.getString("name"));
//			customer.setPassword(rs.getString("password"));
//			customer.setEmail(rs.getString("email"));
//			customer.setContact(rs.getInt("contact"));
//			list.add(customer);
//		}
		return list;
	}

	@Override
	public List<Admin> getAllAdmin() throws SQLException {

		Connection con= getCon();
		List<Admin> list=new ArrayList<Admin>();
		PreparedStatement pst=null;
		String sql="select * from customer";
		pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
//		while(rs.next()){
//			Customer customer=new Customer();
//			customer.setId(rs.getInt("id"));
//			customer.setUname(rs.getString("name"));
//			customer.setPassword(rs.getString("password"));
//			customer.setEmail(rs.getString("email"));
//			customer.setContact(rs.getInt("contact"));
//			list.add(customer);
//		}
		return list;
	}

	@Override
	public List<String> getAllLocations() throws SQLException {

		Connection con= getCon();
		List<String> list=new ArrayList<String>();
		PreparedStatement pst=null;
		String sql="select * from locations";
		pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			list.add(rs.getString("loc"));
		}
		return list;
	}
}
