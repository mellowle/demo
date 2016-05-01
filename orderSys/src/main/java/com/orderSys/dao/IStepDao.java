/**
 * 
 */
package com.orderSys.dao;

import com.orderSys.model.OrderEntity;
import com.orderSys.model.StepEntity;

/**
 * @author mello
 */
public interface IStepDao {
	public void add(OrderEntity order, int stepId);
	public void update(StepEntity step, OrderEntity order, int stepId);
	public StepEntity find(StepEntity step, OrderEntity order, int stepId); 
}
