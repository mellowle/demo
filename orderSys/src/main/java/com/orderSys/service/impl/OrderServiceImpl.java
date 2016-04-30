/**
 * 
 */
package com.orderSys.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orderSys.dao.IOrderDao;
import com.orderSys.dao.IUserDao;
import com.orderSys.model.UserEntity;
import com.orderSys.service.IOrderService;

/**
 * @author mello
 */
@Transactional
@Service("orderService")
public class OrderServiceImpl implements IOrderService{

	@Resource
	private IOrderDao orderDao;
	@Override
	public void addOrder(UserEntity user) {
		// TODO Auto-generated method stub
		orderDao.addOrder(user);
	}

}
