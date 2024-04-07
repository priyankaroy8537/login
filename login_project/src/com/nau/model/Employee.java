package com.nau.model;

public class Employee {
    private int id;
   // private String password;
    private String lname;
    private String fname;
	public Employee(int id, String lname, String fname) {
		super();
		this.id = id;
		this.lname = lname;
		this.fname = fname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
    
}
