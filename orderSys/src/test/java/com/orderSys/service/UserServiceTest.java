package com.orderSys.service;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.orderSys.model.UserEntity;
import com.orderSys.service.IUserService;

@ContextConfiguration(locations= {"classpath:spring.xml","classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {
	@Resource
	private IUserService userService;
	@Test
	public void testIsExist(){
		UserEntity user = new UserEntity();
		user.setUsername("test");
		user.setPassword("1234");
		boolean result = userService.isExisted(user);
		System.out.println(result);
	}

}
