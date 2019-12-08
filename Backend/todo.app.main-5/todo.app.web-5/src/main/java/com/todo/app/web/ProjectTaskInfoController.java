package com.todo.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.app.common.entity.ProjectTaskInfo;
import com.todo.app.service.BaseService;
import com.todo.app.service.ProjectTaskInfoService;

@RestController
@RequestMapping(path = "/api/services/todo-app/project-task-info")
public class ProjectTaskInfoController extends BaseController<ProjectTaskInfo, ProjectTaskInfo>{

	@Autowired
	ProjectTaskInfoService projectTaskInfoService;
	
	@Override
	public BaseService<ProjectTaskInfo, ProjectTaskInfo> getBaseService() {
		return projectTaskInfoService;
	}
	
}
