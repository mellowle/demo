/**
 * 
 */
package com.orderSys.dao.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.orderSys.dao.IOrderDao;
import com.orderSys.model.OrderEntity;
import com.orderSys.model.UserEntity;

/**
 * @author mello
 */
@Repository("orderDao")
public class OrderDaoImpl implements IOrderDao {

	@Resource
	protected SessionFactory sessionFactory;


	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	/* (non-Javadoc)
	 * @see com.orderSys.dao.IOrderDao#addOrder(com.orderSys.model.UserEntity)
	 */
	@Override
	public void addOrder(UserEntity user) {
		// TODO Auto-generated method stub
		Session session = this.getSession();
		OrderEntity order = new OrderEntity();
		order.setUserId(user.getId());
		order.setScheduling(false);
		order.setPreprocessing(false);
		order.setProcessing(false);
		order.setPostprocessing(false);
		order.setFailed(false);
		order.setCompleted(false);
		order.setStartTime(new Date());
		order.setCompleteTime(null);
		session.save(order);
	}

	/* (non-Javadoc)
	 * @see com.orderSys.dao.IOrderDao#updateOrder(com.orderSys.model.OrderEntity)
	 */
	@Override
	public void updateOrder(OrderEntity order) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.orderSys.dao.IOrderDao#findOrder(com.orderSys.model.OrderEntity)
	 */
	@Override
	public OrderEntity findOrder(OrderEntity order) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.orderSys.dao.IOrderDao#findAllOrder(com.orderSys.model.UserEntity)
	 */
	@Override
	public List<OrderEntity> findAllOrder(UserEntity user) {
		// TODO Auto-generated method stub
		return null;
	}

}
