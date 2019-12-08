package com.todo.app.service;

import org.springframework.stereotype.Service;

import com.todo.app.common.entity.ProjectTaskInfo;

@Service
public class ProjectTaskInfoService extends BaseService<ProjectTaskInfo, ProjectTaskInfo> {

	@Override
	public ProjectTaskInfo create(ProjectTaskInfo projectTaskInfo) {
		return projectTaskInfo;
	}

	@Override
	public ProjectTaskInfo update(ProjectTaskInfo projectTaskInfo) {
		return projectTaskInfo;
	}

	@Override
	public ProjectTaskInfo read(Long id) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

	@Override
	public void generateMultiple(Integer noOfEntities) {

	}

}
