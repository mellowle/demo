/**
 * 
 */
package com.orderSys.service.impl;

import java.util.Random;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Async;

import com.orderSys.dao.IStepDao;
import com.orderSys.model.OrderEntity;

/**
 * @author mello
 */
public class PreProcessingServiceThread implements Runnable{
	@Resource
	private IStepDao stepDao;
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		OrderEntity order = new OrderEntity();
		boolean flag;
		try {
			flag = this.addStepTwo(order);
			if(flag == false){
				//rollback
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private boolean addStepTwo(OrderEntity order) throws InterruptedException {

		Thread.sleep(500);
		Random random = new Random();
		int i = random.nextInt(100);
		if(i<= 5){
			return false;
		}
		stepDao.add(order, 2);
		return true;
	}

}
