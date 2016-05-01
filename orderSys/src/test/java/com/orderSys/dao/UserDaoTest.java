package com.orderSys.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.orderSys.dao.IUserDao;
import com.orderSys.model.UserEntity;

@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class UserDaoTest {
	@Resource
	private IUserDao userDao;

	@Test
	public void testIsExist() {
		UserEntity user = new UserEntity();
		user.setUsername("test");
		user.setPassword("1234");
		boolean result = userDao.isExisted(user);
		System.out.println(result);
	}

}
