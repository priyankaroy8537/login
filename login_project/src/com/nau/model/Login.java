package com.nau.model;

// select * from login where userid=userid and password=password
// insert into login values(userId,password,fname,lname)
// select * from login where userid=userid
// update login set password=newpassword where userid=userid
// delete from login where userid=userid

public class Login {
	private Integer userId;
	private String password;
	private String lName;
	private String fname;
	public Login() {
	}
	public Login(Integer userId, String password, String lName, String fname) {
		super();
		this.userId = userId;
		this.password = password;
		this.lName = lName;
		this.fname = fname;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "Login [userId=" + userId + ", password=" + password + ", lName=" + lName + ", fname=" + fname + "]";
	}
	
	
}
