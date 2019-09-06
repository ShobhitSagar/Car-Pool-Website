package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.models.Find;
import com.models.Offer;
import com.models.User;

public interface DAO {
	public String addUser(User user) throws SQLException;
	public String updateUser(User user) throws SQLException;
	public String deleteUser(User user) throws SQLException;
	public List<User> getAllUser() throws SQLException;
	public List<String> getAllLocations() throws SQLException;
	public String offerRide(Offer offer) throws SQLException;
	public List findRide(Find find) throws SQLException;
}
