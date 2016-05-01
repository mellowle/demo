/**
 * 
 */
package com.orderSys.dao.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.orderSys.dao.IStepDao;
import com.orderSys.model.OrderEntity;
import com.orderSys.model.PostProcessingEntity;
import com.orderSys.model.PreProcessingEntity;
import com.orderSys.model.ProcessingEntity;
import com.orderSys.model.SchedulingEntity;
import com.orderSys.model.StepEntity;
import com.orderSys.model.UserEntity;

/**
 * @author mello
 */
@Repository("stepDao")
public class StepDaoImpl implements IStepDao {
	@Resource
	protected SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	/* (non-Javadoc)
	 * @see com.orderSys.dao.IStepDao#add(com.orderSys.model.StepEntity, int)
	 */
	@Override
	public void add(OrderEntity order, int stepId) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		if(stepId == 1){
			SchedulingEntity stepOne = new SchedulingEntity();
			stepOne.setOrderId(order.getOrderId());
			stepOne.setFinish(false);
			stepOne.setStartTime(new Date());
			session.save(stepOne);
		}else if(stepId == 2){
			PreProcessingEntity stepTwo = new PreProcessingEntity();
			stepTwo.setOrderId(order.getOrderId());
			stepTwo.setFinish(false);
			stepTwo.setStartTime(new Date());
			session.save(stepTwo);
		}else if(stepId == 3){
			ProcessingEntity stepTHR = new ProcessingEntity();
			stepTHR.setOrderId(order.getOrderId());
			stepTHR.setFinish(false);
			stepTHR.setStartTime(new Date());
			session.save(stepTHR);
		}else if(stepId == 4){
			PostProcessingEntity stepFOU = new PostProcessingEntity();
			stepFOU.setOrderId(order.getOrderId());
			stepFOU.setFinish(false);
			stepFOU.setStartTime(new Date());
			session.save(stepFOU);
		}
	}

	/* (non-Javadoc)
	 * @see com.orderSys.dao.IStepDao#update(com.orderSys.model.StepEntity, int)
	 */
	@Override
	public void update(StepEntity step,  OrderEntity order, int stepId) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.orderSys.dao.IStepDao#find(com.orderSys.model.StepEntity, int)
	 */
	@Override
	public StepEntity find(StepEntity step,  OrderEntity order, int stepId) {
		// TODO Auto-generated method stub
		return null;
	}

}
