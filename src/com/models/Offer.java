package com.models;

import java.sql.Date;
import java.sql.Time;

public class Offer {
	
	private String pickup, time, dropoff, date;
	private int price, seats;
	
	public Offer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Offer(String pickup, String dropoff, String date, String time, int price, int seats) {
		super();
		this.pickup = pickup;
		this.dropoff = dropoff;
		this.date = date;
		this.time = time;
		this.price = price;
		this.seats = seats;
	}

	public String getPickup() {
		return pickup;
	}
	public void setPickup(String pickup) {
		this.pickup = pickup;
	}
	public String getDropoff() {
		return dropoff;
	}
	public void setDropoff(String dropoff) {
		this.dropoff = dropoff;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	
}
