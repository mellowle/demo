/**
 * 
 */
package com.orderSys.dao;

import com.orderSys.model.StepEntity;

/**
 * @author mello
 */
public interface IStepDao {
	public void add(StepEntity step,int stepId);
	public void update(StepEntity step, int stepId);
	public StepEntity find(StepEntity step, int stepId); 
}
