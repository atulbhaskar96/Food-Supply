package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;
import com.example.demo.model.UserAdmin;
import com.example.demo.service.UserAdminService;
//Test Controller
@RestController
public class UserController {
	
	@Autowired
	UserAdminService userAdminService; 
	
	@PostMapping("/user")
	public String saveUser(@RequestBody User user ) {
		try {
			UserAdmin userAdmin = ControllerUtils.getUserModel(user);
			userAdminService.saveUser(userAdmin);
		}
		catch(Exception e) {
			e.printStackTrace();
			return "exception";
		}
		return "sucess";
	}
	@GetMapping("/getUser")
	public UserAdmin getUser() {
		return userAdminService.getUser();
	}

}
