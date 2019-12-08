package com.todo.app.service;

import org.springframework.stereotype.Service;

import com.todo.app.common.entity.Category;

@Service
public class CategoryService extends BaseService<Category, Category> {

	@Override
	public Category create(Category category) {
		return category;
	}

	@Override
	public Category update(Category category) {
		return category;
	}

	@Override
	public Category read(Long id) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

	@Override
	public void generateMultiple(Integer noOfEntities) {

	}

}
