package com.service;

import java.sql.SQLException;
import java.util.List;

import com.models.Find;
import com.models.Offer;
import com.models.User;

public interface Service {
	public String addUser(User user);
	public String UpdateUser(User user);
	public String deleteUser(User user);
	public List<User> getAllUser();
	public List<String> getAllLocations();
	public String offerRide(Offer offer) throws SQLException;
	public List findRide(Find find) throws SQLException;
}
