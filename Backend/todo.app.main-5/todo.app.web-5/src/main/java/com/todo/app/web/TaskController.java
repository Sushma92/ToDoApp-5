package com.todo.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.app.common.entity.Task;
import com.todo.app.service.BaseService;
import com.todo.app.service.TaskService;

@RestController
@RequestMapping(path = "/api/services/todo-app/task")
public class TaskController extends BaseController<Task, Task> {

	@Autowired
	TaskService taskService;
	
	@Override
	public BaseService<Task, Task> getBaseService() {
		return taskService;
	}

}