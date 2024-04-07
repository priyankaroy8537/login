package com.nau.service;

import java.util.List;

import com.nau.model.Login;

public interface LoginService {
	
	Login getUserByIdAndPassword(Integer userId, String password);
	Integer addUser(Login... login);
	Login getUserById(Integer userId);
	Boolean udpatePassword(Integer userId, String newPassword);
	Integer deleteUser(Integer... userId);
	List<Login> getAllUsers();

}
