/**
 * 
 */
package com.orderSys.dao;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.orderSys.model.OrderEntity;
import com.orderSys.model.UserEntity;
/**
 * @author mello
 */

@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
// defaultRollback=true不会改变数据库，false会改变数据库
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class OrderDaoTest {
	
	@Resource
	private IOrderDao orderDao;
	
	@Test
	public void testFindOrder() {
		UserEntity user = new UserEntity();
		user.setId(3);
//		order.setScheduling(false);
//		order.setPreprocessing(false);
//
//		order.setProcessing(false);
//		order.setPostprocessing(false);
//		order.setStartTime(new Date());
//		order.setCompleted(false);
//		order.setCompleteTime(new Date());
//		order.setFailed(false);
//		
		orderDao.addOrder(user);;
		System.out.println("~~~~~~~~~~~~~~~~done~~~~~~~~");
//		orderDao.updateOrder(order);
		
//		OrderEntity rsOrder = orderDao.findOrder(order);
//		System.out.println(rsOrder.getCompleteTime());
	}

}
