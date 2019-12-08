package com.todo.app.service;

import org.springframework.stereotype.Service;

import com.todo.app.common.entity.Task;

@Service
public class TaskService extends BaseService<Task, Task> {

	@Override
	public Task create(Task task) {
		return task;
	}

	@Override
	public Task update(Task task) {
		return task;
	}

	@Override
	public Task read(Long id) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

	@Override
	public void generateMultiple(Integer noOfEntities) {

	}

}
