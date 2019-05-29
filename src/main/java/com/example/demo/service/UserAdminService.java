package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserAdmin;
import com.example.demo.repositories.IUserAdminRespository;

@Service
public class UserAdminService {

	@Autowired
	IUserAdminRespository userAdminRespository;
	

	public UserAdmin getUser() {
		// TODO Auto-generated method stub
		return userAdminRespository.findById(1L).get();
	}


	public void saveUser(UserAdmin user) {
		userAdminRespository.save(user);
		
	}
	
}
