/**
 * 
 */
package com.orderSys.service;

import com.orderSys.model.UserEntity;

/**
 * @author mello
 */
public interface IUserService {
	public boolean isExisted(UserEntity user);
}
