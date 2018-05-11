package com.wahaha.controller;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wahaha.bean.Employee;
import com.wahaha.bean.InterestBook;
import com.wahaha.bean.InterestCity;
import com.wahaha.bean.InterestDirection;
import com.wahaha.bean.Message;
import com.wahaha.bean.SearchContent;
import com.wahaha.bean.UserInfo;
import com.wahaha.service.AuthenticateService;
/*
 * 处理登录，注册，个人信息增删改查相关的逻辑
 */
@Controller
@RequestMapping("/authenticate")
public class AuthenticateController {
	@Autowired
	AuthenticateService authenticateService;
	
	//注册,@Valid表示employee里的数据需按照employee属性指定的条件校验
	@RequestMapping("/register")
	@ResponseBody
	public Message register(@Valid UserInfo userInfo, BindingResult result) {
//		UserInfo userInfo,InterestBook interestBook,InterestCity interestCity,InterestDirection interestDirection;
		if(result.hasErrors()) {
			//校验失败，获得错误信息
			Map<String, Object> map = new HashMap<>();
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				System.out.println("错误的字段名： " + fieldError.getField());
				System.out.println("错误的信息： " + fieldError.getDefaultMessage());
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Message.fail().add("errorFields", map);
		}
		if(authenticateService.checkUserName(userInfo.getEmail())) {
			authenticateService.register(userInfo,new InterestBook(),new InterestCity(),new InterestDirection(),new SearchContent());
			return Message.success();
		}
		return Message.fail();
	}
	
	//登录
	@RequestMapping("/login")
	@ResponseBody
	public Message login(@RequestParam(value="email")String email,@RequestParam(value="password")String password,
			HttpServletRequest request) {
		//创建一个会话
		HttpSession session = request.getSession(true);
		
		if(authenticateService.checkUserName(email)) {
			return Message.fail().add("value_message","用户不存在,请重新输入");
		}
		if(!authenticateService.checkPassword(email, password, session)) {
			
			session.setAttribute("loginStatus", "success");
			
			return Message.fail().add("value_message","密码错误,请重新输入");
		}
		System.out.println(session.getAttribute("userId"));
		return Message.success();
	}
	
	//个人信息保存,@Valid表示userInfo里的数据需按照userInfo属性指定的条件校验
	@RequestMapping("/saveInfo")
	@ResponseBody
	public Message saveInfo(@Valid UserInfo user,BindingResult result,HttpServletRequest request) {
		if(result.hasErrors()) {
			//校验失败，获得错误信息
			Map<String, Object> map = new HashMap<>();
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				System.out.println("错误的字段名: " + fieldError.getField());
				System.out.println("错误的信息： " + fieldError.getDefaultMessage());
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Message.fail().add("errorFields", map);
		}
		HttpSession session = request.getSession(true);
		user.setId((String) session.getAttribute("userId"));
		authenticateService.saveInfo(user);
		
		return Message.success();
	}
	
	//查看并展示个人信息
	@RequestMapping("/getInfo")
	@ResponseBody
	public Message getInfo(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		String userId = (String) session.getAttribute("userId");
		UserInfo info = authenticateService.getInfo(userId);
		return Message.success().add("status", info.getStatus());
	}
	
	@RequestMapping("/logout")
	@ResponseBody
	public Message logout(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		session.invalidate();
		return Message.success();
	}
} 
