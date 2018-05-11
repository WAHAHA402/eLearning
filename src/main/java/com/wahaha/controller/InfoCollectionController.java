package com.wahaha.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wahaha.bean.Message;
import com.wahaha.bean.SearchContent;
import com.wahaha.bean.SearchContentAble;
import com.wahaha.bean.UserInfo;
import com.wahaha.service.AuthenticateService;
import com.wahaha.service.InfoCollectionService;

/*
 * 处理用户行为收集等逻辑/infoCollection/updateClickContent
 * 以下以css，java，android为搜索对象和点击对象
	2代表数据库中的css 4:java 5:android
 */
@Controller
@RequestMapping("/infoCollection")
public class InfoCollectionController {
	@Autowired
	InfoCollectionService infoCollectionService;
	@Autowired
	AuthenticateService authenticateService;
	//根据用户点击的类别进行插入，ajax需传入一个category参数
	@RequestMapping("/updateClickContent")
	@ResponseBody
	public Message insertClickContent(@RequestParam(value="category")Integer category,HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		String userId = (String) session.getAttribute("userId");
		SearchContent searchContent = new SearchContent();
		searchContent.setUserid(userId);
		//将用户状态属性设为 1，表示已经点击或搜索过内容
		UserInfo userInfo = authenticateService.getInfo(userId);
		userInfo.setStatus(1);
		authenticateService.saveInfo(userInfo);
		//
		SearchContent searchContent2 = infoCollectionService.selectSearchContent(searchContent);
		int frontEndFoundation = searchContent2.getFrontendfoundation();
		int frontEndAdvance = searchContent2.getFrontendadvance();
		int backEnd = searchContent2.getBackend();
		int mobileDevelop = searchContent2.getMobiledevelop();
		int database = searchContent2.getDatabase666();
		//System.out.println("到这了");
		
		switch(category)
		{
			case 1: 
				//以css为例
				searchContent2.setRecenttechitem(2);
				searchContent2.setFrontendfoundation(++frontEndFoundation); break;
			case 2: 
				//angualr
				searchContent2.setRecenttechitem(7);
				searchContent2.setFrontendadvance(++frontEndAdvance); break;
			case 3:	
				//以java为例
				searchContent2.setRecenttechitem(4);
				searchContent2.setBackend(++backEnd); break;
			case 4: 
				//以android为例
				searchContent2.setRecenttechitem(5);
				searchContent2.setMobiledevelop(++mobileDevelop); break;
			case 5: 
				//mongoDB
				searchContent2.setRecenttechitem(6);
				searchContent2.setDatabase666(++database); break;
		}
		
		infoCollectionService.updateClickContent(searchContent2);
		//System.out.println("666");
		return Message.success();
	}
	
	//根据用户搜索的内容判断其所属类别并插入到数据库
	@RequestMapping("/updateSearchContent")
	@ResponseBody
	public Message insertSearchContent(@RequestParam(value="content")String content, HttpServletRequest request) {
		SearchContentAble searchConAble = new SearchContentAble();
		String userId = (String)request.getSession(true).getAttribute("userId");
		SearchContent searchContent = new SearchContent();
		searchContent.setUserid(userId);
		//将用户状态属性设为 1，表示已经点击或搜索过内容
		UserInfo userInfo = authenticateService.getInfo(userId);
		userInfo.setStatus(1);
		authenticateService.saveInfo(userInfo);
		//
		SearchContent searchContent2 = infoCollectionService.selectSearchContent(searchContent);
		int frontEndFoundation = searchContent2.getFrontendfoundation();
		int frontEndAdvance = searchContent2.getFrontendadvance();
		int backEnd = searchContent2.getBackend();
		int mobileDevelop = searchContent2.getMobiledevelop();
		int database = searchContent2.getDatabase666();
		System.out.println("这里是InfoCollectionController的updateSearchContent");
		if(searchConAble.isFrontFo(content)) {
			//以css为例,这里的数值代表css在technologyType表中的id
			searchContent2.setRecenttechitem(2);
			searchContent2.setFrontendfoundation(++frontEndFoundation);
		}else if(searchConAble.isFrontAd(content)) {
			//angualr
			searchContent2.setRecenttechitem(7);
			searchContent2.setFrontendadvance(++frontEndAdvance);
		}else if(searchConAble.isBackEn(content)) {
			//以java为例
			searchContent2.setRecenttechitem(4);
			searchContent2.setBackend(++backEnd);
		}else if(searchConAble.isDatabase666(content)) {
			//mongoDB
			searchContent2.setRecenttechitem(6);
			searchContent2.setDatabase666(++database);
		}else if(searchConAble.isMobileDe(content)) {
			//以android为例
			searchContent2.setRecenttechitem(5);
			searchContent2.setMobiledevelop(++mobileDevelop);
		}
		
		infoCollectionService.updateClickContent(searchContent2);
		//System.out.println("666");
		return Message.success();
	}
}
