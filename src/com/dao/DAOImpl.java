package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.models.Find;
import com.models.Offer;
import com.models.User;


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
			System.out.println("Connection failed!!!");
		}
		return con;
	}

	@Override
	public String addUser(User offer) throws SQLException {
		
		Connection con= getCon();
		String result="FAIL";
		PreparedStatement pst=null;
		String sql="insert into offer(id, name,email,password,contact) values(NULL,?,?,?,?)";
		pst=con.prepareStatement(sql);
		pst.setString(1, offer.getUname());
		pst.setString(2, offer.getEmail());
		pst.setString(3, offer.getPassword());
		pst.setLong(4, offer.getContact());
		int r=pst.executeUpdate();
		if(r>0){
			result="SUCCESS";
		}
		return result;
	}


	@Override
	public String updateUser(User offer) throws SQLException {

		Connection con= getCon();
		String result="FAIL";
		PreparedStatement pst=null;
		String sql="update offer set name=?,email=?,password=?,contact=? where id=?";
		pst=con.prepareStatement(sql);
		pst.setString(1, offer.getUname());
		pst.setString(2, offer.getEmail());
		pst.setString(3, offer.getPassword());
		pst.setLong(4, offer.getContact());
		pst.setInt(5, offer.getId());
		int r=pst.executeUpdate();
		if(r>0){
			result="SUCCESS";
		}
		return result;
	}

	@Override
	public String deleteUser(User offer) throws SQLException {

		Connection con= getCon();
		String result="FAIL";
		PreparedStatement pst=null;
		String sql="delete offer(id,name,email,password,contact) where id=?";
		pst=con.prepareStatement(sql);
		pst.setInt(1, offer.getId());
		int r=pst.executeUpdate();
		if(r>0){
			result="SUCCESS";
		}
		return result;
	}

	@Override
	public List<User> getAllUser() throws SQLException {

		Connection con= getCon();
		List<User> list=new ArrayList<User>();
		PreparedStatement pst=null;
		String sql="select * from user";
		pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			User offer=new User();
			offer.setId(rs.getInt("id"));
			offer.setUname(rs.getString("name"));
			offer.setPassword(rs.getString("password"));
			offer.setEmail(rs.getString("email"));
			offer.setContact(rs.getInt("contact"));
			list.add(offer);
		}
		return list;
	}


	@Override
	public List<String> getAllLocations() throws SQLException {

		Connection con= getCon();
		List<String> list=new ArrayList<String>();
		PreparedStatement pst=null;
		String sql="select distinct loc from locations";
		pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			list.add(rs.getString("loc"));
		}
		return list;
	}

	@Override
	public String offerRide(Offer offer) throws SQLException {
		
		Connection con= getCon();
		String result="FAIL";
		PreparedStatement pst=null;
		PreparedStatement pst2=null;
		PreparedStatement pst3=null;
		String sql="insert into offerride(id, pickup, dropoff, date, time, price, seats) values(NULL, ?,?,?,?,?,?)";
		String sql2="insert into locations values(?)";
		String sql3="insert into locations values(?)";
		pst=con.prepareStatement(sql);
		pst2=con.prepareStatement(sql2);
		pst3=con.prepareStatement(sql3);
		pst.setString(1, offer.getPickup());
		pst2.setString(1, offer.getPickup());
		pst.setString(2, offer.getDropoff());
		pst3.setString(1, offer.getDropoff());
		pst.setString(3, offer.getDate());
		pst.setString(4, offer.getTime());
		pst.setInt(5, offer.getPrice());
		pst.setInt(6, offer.getSeats());
		int r=pst.executeUpdate();
		pst2.executeUpdate();
		pst3.executeUpdate();
		if(r>0){
			result="SUCCESS";
		}
		return result;
	}

	@Override
	public List findRide(Find find) throws SQLException {
		
		Connection con= getCon();
		Offer offer=new Offer();
		List<Offer> list=new ArrayList<Offer>();
		String result="FAIL";
		PreparedStatement pst=null;
		String sql="select * from offerride where pickup=? and dropoff=?";
		pst=con.prepareStatement(sql);
		pst.setString(1, find.getPick());
		pst.setString(2, find.getDestination());
		ResultSet r=pst.executeQuery();
		while(r.next()){
			find.setPick(r.getString("pickup"));
			find.setDestination(r.getString("dropoff"));
			find.setDate(r.getString("date"));
			find.setTime(r.getString("time"));
			find.setPrice(r.getInt("price"));
			find.setSeats(r.getInt("seats"));
			list.add(offer);
		}
		return list;
	}
}
