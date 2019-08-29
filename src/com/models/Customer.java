package com.models;

public class Customer {
	 private String  uname,email,password;
	 private int contact, id;
	 
	 public Customer() {
		 
	 }

	public Customer(String  uname,String email, String password, int contact) {
		super();
		this.uname = uname;
		this.email = email;
		this.password = password;
		this.contact = contact;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
