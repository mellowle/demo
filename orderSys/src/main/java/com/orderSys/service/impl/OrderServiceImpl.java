/**
 * 
 */
package com.orderSys.service.impl;

import java.util.Random;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Stopwatch;
import com.orderSys.dao.IOrderDao;
import com.orderSys.dao.IStepDao;
import com.orderSys.dao.IUserDao;
import com.orderSys.model.OrderEntity;
import com.orderSys.model.StepEntity;
import com.orderSys.model.UserEntity;
import com.orderSys.service.IOrderService;

/**
 * @author mello
 */
@Transactional
@Service("orderService")
public class OrderServiceImpl implements IOrderService {

	@Resource
	private IOrderDao orderDao;
	private IStepDao stepDao;
	private TaskExecutor taskExecutor;

	@Override
	public void addOrder(UserEntity user) {
		// TODO Auto-generated method stub
		orderDao.addOrder(user);
		OrderEntity order = new OrderEntity();
		try {
			SchedulingServiceThread scheduleST = new SchedulingServiceThread ();
			taskExecutor.execute(scheduleST);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			PreProcessingServiceThread preProcST = new PreProcessingServiceThread ();
			taskExecutor.execute(preProcST);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			ProcessingServiceThread procST = new ProcessingServiceThread ();
			taskExecutor.execute(procST);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			PostProcessingServiceIThread postProcST = new PostProcessingServiceIThread ();
			taskExecutor.execute(postProcST);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
