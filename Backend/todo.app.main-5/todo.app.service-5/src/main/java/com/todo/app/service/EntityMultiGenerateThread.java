package com.todo.app.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EntityMultiGenerateThread extends Thread {

	private Integer noOfEntitiesForThisThread;
	private BaseService baseService;

	public EntityMultiGenerateThread() {

	}

	public Integer getNoOfEntitiesForThisThread() {
		return noOfEntitiesForThisThread;
	}

	public void setNoOfEntitiesForThisThread(Integer noOfEntitiesForThisThread) {
		this.noOfEntitiesForThisThread = noOfEntitiesForThisThread;
	}

	public BaseService getBaseService() {
		return baseService;
	}

	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}

	@Override
	public void run() {
		for (int entityCtr = 1; entityCtr <= noOfEntitiesForThisThread; entityCtr++) {
		}
	}

}
