package com.todo.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.todo.app.common.entity.BaseEntity;

public interface BaseDAO<E extends BaseEntity, R> extends CrudRepository<E, Long> {

	
}
