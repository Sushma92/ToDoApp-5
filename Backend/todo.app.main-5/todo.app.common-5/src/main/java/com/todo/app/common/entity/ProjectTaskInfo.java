package com.todo.app.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "ProjectTaskInfo")
@Table(name = "project_task_info")
public class ProjectTaskInfo extends BaseEntity {

	@Column(name = "project_id")
	private Long projectId;

	@Column(name = "task_id")
	private Long taskId;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

}
