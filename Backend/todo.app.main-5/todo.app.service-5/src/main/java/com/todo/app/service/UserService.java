package com.todo.app.service;

import org.springframework.stereotype.Service;

import com.todo.app.common.entity.User;

@Service
public class UserService extends BaseService<User, User> {

	@Override
	public User create(User user) {
		return user;
	}

	@Override
	public User update(User user) {
		return user;
	}

	@Override
	public User read(Long id) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

	@Override
	public void generateMultiple(Integer noOfEntities) {

	}

}
