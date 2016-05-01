/**
 * 
 */
package com.orderSys.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.orderSys.model.UserEntity;
import com.orderSys.service.IUserService;

/**
 * @author mello
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;

	@ResponseBody
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	// public Map<String,Object> login( UserEntity user){
	// Map<String,Object> map = new HashMap<String,Object>();
	// System.out.println(user.toString());
	// boolean loginResult = userService.isExisted(user);
	// map.put("loginResult", loginResult);
	// return map;
	// }

	public ModelAndView login(@ModelAttribute UserEntity user) {

		ModelAndView modelAndView = new ModelAndView("main");
		if (userService.isExisted(user) == true){
			return modelAndView;
		}
		return modelAndView;

//		String message = "Team was successfully added.";
//		modelAndView.addObject("message", message);


	}

}
