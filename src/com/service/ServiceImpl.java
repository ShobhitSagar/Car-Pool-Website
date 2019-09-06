package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.DAO;
import com.dao.DAOImpl;
import com.models.Find;
import com.models.Offer;
import com.models.User;

public class ServiceImpl implements Service{
	DAO dao=new DAOImpl();
	
	@Override
	public String addUser(User user) {
		String result=null;
		try {
			result=dao.addUser(user);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String UpdateUser(User user) {
		String result=null;
		try {
			result=dao.updateUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String deleteUser(User user) {
		String result=null;
		try {
			result=dao.deleteUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<User> getAllUser() {
		List<User> list=null;
		try {
			list=dao.getAllUser();
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

	@Override
	public String offerRide(Offer offer) throws SQLException {
		String result=null;
		try {
			result=dao.offerRide(offer);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List findRide(Find find) throws SQLException {
		List<User> list=null;
		try {
			list=dao.findRide(find);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
