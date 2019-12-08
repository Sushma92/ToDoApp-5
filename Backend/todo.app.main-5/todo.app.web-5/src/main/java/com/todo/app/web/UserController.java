package com.todo.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.app.common.entity.User;
import com.todo.app.service.BaseService;
import com.todo.app.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/api/services/todo-app/user")

public class UserController extends BaseController<User, User>{

	@Autowired
	UserService userService;
	
	@Override
	public BaseService<User, User> getBaseService() {
		return userService;
	}

}