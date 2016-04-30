/**
 * 
 */
package com.orderSys.dao;

import java.util.List;

import com.orderSys.model.OrderEntity;
import com.orderSys.model.UserEntity;

/**
 * @author mello
 */
public interface IOrderDao {
	
	public void addOrder(UserEntity user);
	
	public void updateOrder(OrderEntity order);
	
	public OrderEntity findOrder(OrderEntity order);
	
	public List<OrderEntity> findAllOrder(UserEntity user);

}
