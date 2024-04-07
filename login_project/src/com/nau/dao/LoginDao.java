package com.nau.dao;

import java.util.List;

import com.nau.model.Login;

public interface LoginDao {
	Login getUserByIdAndPassword(Integer userId, String password);
	Integer saveUser(List<Login> logins);
	Login getUserById(Integer userId);
	Boolean udpatePassword(Integer userId, String newPassword);
	Integer deleteUser(Integer... userId);
	List<Login> getAllUsers();
}
