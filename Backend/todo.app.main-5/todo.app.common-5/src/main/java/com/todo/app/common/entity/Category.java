package com.todo.app.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Category")
@Table(name = "category")
public class Category extends BaseEntity{

	@Column(name = "description", length = 1000)
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
