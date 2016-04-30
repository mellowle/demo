/**
 * 
 */
package com.orderSys.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.orderSys.dao.IStepDao;
import com.orderSys.model.PostProcessingEntity;
import com.orderSys.model.PreProcessingEntity;
import com.orderSys.model.ProcessingEntity;
import com.orderSys.model.SchedulingEntity;
import com.orderSys.model.StepEntity;

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
	public void add(StepEntity step, int stepId) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		if(stepId == 1){
			session.save((SchedulingEntity) step);
		}else if(stepId == 2){
			session.save((PreProcessingEntity) step);
		}else if(stepId == 3){
			session.save((ProcessingEntity) step);
		}else if(stepId == 4){
			session.save((PostProcessingEntity) step);
		}
	}

	/* (non-Javadoc)
	 * @see com.orderSys.dao.IStepDao#update(com.orderSys.model.StepEntity, int)
	 */
	@Override
	public void update(StepEntity step, int stepId) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.orderSys.dao.IStepDao#find(com.orderSys.model.StepEntity, int)
	 */
	@Override
	public StepEntity find(StepEntity step, int stepId) {
		// TODO Auto-generated method stub
		return null;
	}

}
