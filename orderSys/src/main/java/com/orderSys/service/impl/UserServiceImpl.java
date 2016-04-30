/**
 * 
 */
package com.orderSys.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orderSys.dao.IUserDao;
import com.orderSys.model.UserEntity;
import com.orderSys.service.IUserService;

/**
 * @author mello
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	@Override
	public boolean isExisted(UserEntity user) {
		return userDao.isExisted(user);
	}

}
