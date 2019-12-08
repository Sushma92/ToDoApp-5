package com.todo.app.dao;

import org.springframework.stereotype.Repository;

import com.todo.app.common.entity.Task;

@Repository
public interface TaskDAO extends BaseDAO<Task, Task>{

}
