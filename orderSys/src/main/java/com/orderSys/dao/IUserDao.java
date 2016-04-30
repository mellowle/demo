/**
 * 
 */
package com.orderSys.dao;

import com.orderSys.model.UserEntity;

/**
 * @author mello
 */
public interface IUserDao {
	public boolean isExisted(UserEntity user);
}
