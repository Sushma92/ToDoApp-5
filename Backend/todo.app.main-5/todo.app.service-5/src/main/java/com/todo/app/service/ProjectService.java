package com.todo.app.service;

import org.springframework.stereotype.Service;

import com.todo.app.common.entity.Project;

@Service
public class ProjectService extends BaseService<Project, Project> {

	@Override
	public Project create(Project project) {
		return project;
	}

	@Override
	public Project update(Project project) {
		return project;
	}

	@Override
	public Project read(Long id) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

	@Override
	public void generateMultiple(Integer noOfEntities) {

	}

}
