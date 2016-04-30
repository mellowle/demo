///**
// * 
// */
//package com.orderSys.controller;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.annotation.Resource;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.orderSys.model.UserEntity;
//import com.orderSys.service.IOrderService;
//import com.orderSys.service.IUserService;
//
///**
// * @author mello
// */
//@Controller
//@RequestMapping("/order")
//public class OrderController {
//	@Resource
//	private IOrderService orderService;
//	
//	@ResponseBody
//	@RequestMapping(value="/login", method = RequestMethod.POST)
//	public Map<String,Object> login( UserEntity user){
////		Map<String,Object> map = new HashMap<String,Object>();
////		System.out.println(user.toString());
////		boolean loginResult = userService.isExisted(user);
////		map.put("loginResult", loginResult);
////		return map;
//	}
//
//}
