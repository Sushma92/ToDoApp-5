package com.todo.app.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.todo.app.common.entity.BaseEntity;
import com.todo.app.service.BaseService;

public abstract class BaseController<E extends BaseEntity, R> {

	@GetMapping(path = "/create")
	public ResponseEntity<String> create(E entity) {
		this.getBaseService().create(entity);
		return ResponseEntity.ok("");
	}
	
	@GetMapping(path = "/update")
	public ResponseEntity<String> update(E entity) {
		this.getBaseService().update(entity);
		return ResponseEntity.ok("");
	}
	
	@GetMapping(path = "/read")
	public ResponseEntity<String> read(Long id) {
		E entity = this.getBaseService().read(id);
		return ResponseEntity.ok("");
	}
	
	@GetMapping(path = "/delete")
	public ResponseEntity<String> delete(Long id) {
		this.getBaseService().delete(id);
		return ResponseEntity.ok("");
	}

	public abstract BaseService<E, R> getBaseService();
	
	@GetMapping(path = "/generate-multiple")
	public ResponseEntity<String> generateMultiple(Integer noOfEntities){
		this.getBaseService().generateMultiple(noOfEntities);
		return ResponseEntity.ok("");
	}

}
