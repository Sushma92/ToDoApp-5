package com.todo.app.common.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Task")
@Table(name = "task")
public class Task extends BaseEntity {

	@Column(name = "task_name", length = 50)
	private String taskName;

	@Column(name = "task_date")
	private Date taskDate;

	@Column(name = "task_hour")
	private Integer taskHour;

	@Column(name = "task_minute")
	private Integer taskMinute;

	@Column(name = "task_seconds")
	private Integer taskSecond;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(Date taskDate) {
		this.taskDate = taskDate;
	}

	public Integer getTaskHour() {
		return taskHour;
	}

	public void setTaskHour(Integer taskHour) {
		this.taskHour = taskHour;
	}

	public Integer getTaskMinute() {
		return taskMinute;
	}

	public void setTaskMinute(Integer taskMinute) {
		this.taskMinute = taskMinute;
	}

	public Integer getTaskSecond() {
		return taskSecond;
	}

	public void setTaskSecond(Integer taskSecond) {
		this.taskSecond = taskSecond;
	}

}
