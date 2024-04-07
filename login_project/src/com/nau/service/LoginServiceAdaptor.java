package com.nau.service;

import java.util.List;

import com.nau.model.Login;

public abstract class LoginServiceAdaptor implements LoginService {

	@Override
	public Login getUserByIdAndPassword(Integer userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer addUser(Login... login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Login getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean udpatePassword(Integer userId, String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteUser(Integer... userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Login> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
