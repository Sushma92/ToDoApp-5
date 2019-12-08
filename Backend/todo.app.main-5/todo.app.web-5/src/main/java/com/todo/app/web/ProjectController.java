package com.todo.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.app.common.entity.Project;
import com.todo.app.service.BaseService;
import com.todo.app.service.ProjectService;

@RestController
@RequestMapping(path = "/api/services/todo-app/project")
public class ProjectController extends BaseController<Project, Project> {

	@Autowired
	ProjectService projectService;
	
	@Override
	public BaseService<Project, Project> getBaseService() {
		return projectService;
	}

}
