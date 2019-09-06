package com.models;

public class Find {
	private String pick, destination;
	private int price, seats;
	
	public Find() {
		super();
	}
	public Find(String pick, String destination) {
		super();
		this.pick = pick;
		this.destination = destination;
	}
	public String getPick() {
		return pick;
	}
	public void setPick(String pick) {
		this.pick = pick;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
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
