package com.wahaha.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.fabric.xmlrpc.base.Struct;
import com.wahaha.bean.InfoResource;
import com.wahaha.bean.ItemsSort;
import com.wahaha.bean.Message;
import com.wahaha.bean.SearchContent;
import com.wahaha.bean.SearchResource;
import com.wahaha.service.InfoCollectionService;
import com.wahaha.service.InfoPushService;

/*
 * 处理信息推送的相关逻辑/InfoPush/guessHobby
 */
@Controller
@RequestMapping("/InfoPush")
public class InfoPushController {
	@Autowired
	InfoPushService infoPushService;
	@Autowired
	InfoCollectionService infoCoService;
	//用户通过搜索框搜索的内容
	@RequestMapping("/searchItems")
	@ResponseBody
	public Message getSearchItems(@RequestParam(value="pn",defaultValue="1")Integer pn,@RequestParam("content")String content) {
		//引入PageHelper分页插件,在查询之前只需调用,传入页码，以及每页多少条数据，后面紧跟的查询就是分页查询
		PageHelper.startPage(pn, 4);
		List<SearchResource> items = infoPushService.getAll(content);
		//使用PageInfo包装查好的结果，只需将pageInfo交给页面，
		//分装了详细的分页信息和查询出的数据,连续显示的页数4
		PageInfo page = new PageInfo(items, 4);
		return Message.success().add("pageInfo", page);
	}
	
	
	//获取智能推荐的技能：四项最大权重项的内容，和一项最新搜索的内容
	@RequestMapping("/recommendContent")
	@ResponseBody
	public Message getRecContent(HttpServletRequest request) {
		String userId = (String) request.getSession(true).getAttribute("userId");
		SearchContent searchContent = new SearchContent();
		searchContent.setUserid(userId);
		SearchContent searchContent2 = infoCoService.selectSearchContent(searchContent);
		//读取当前用户搜索查看的类别
		int frontEndFoundation = searchContent2.getFrontendfoundation();
		int frontEndAdvance = searchContent2.getFrontendadvance();
		int backEnd = searchContent2.getBackend();
		int mobileDevelop = searchContent2.getMobiledevelop();
		int database = searchContent2.getDatabase666();
		int recentItem = searchContent2.getRecenttechitem();
		//将搜索的种类信息放入ItemsSort对象中
		ItemsSort its0 = new ItemsSort("frontEndFoundation", frontEndFoundation);
		ItemsSort its1 = new ItemsSort("frontEndAdvance", frontEndAdvance);
		ItemsSort its2 = new ItemsSort("backEnd", backEnd);
		ItemsSort its3 = new ItemsSort("mobileDevelop", mobileDevelop);
		ItemsSort its4 = new ItemsSort("database", database);
		//对搜索内容进行排序
		List<ItemsSort> items = new ArrayList<ItemsSort>();
		items.add(its0); items.add(its1); items.add(its2); items.add(its3); items.add(its4);
		Collections.sort(items);
		String it = items.get(items.size()-1).getTag();
		//声明存放总的推送结果的List
		List<SearchResource> list = new LinkedList<SearchResource>();
		System.out.println("智能推荐技能 Controller");
		switch(it) 
		{
		case "frontEndFoundation": list.addAll(infoPushService.getMaxItems(2)); break;
		case "frontEndAdvance":  list.addAll(infoPushService.getMaxItems(7));; break;
		case "backEnd": list.addAll(infoPushService.getMaxItems(4)); break;
		case "mobileDevelop": list.addAll(infoPushService.getMaxItems(5)); break;
		case "database":  list.addAll(infoPushService.getMaxItems(6));; break;
		}
		//获取最新点击或搜索的那项
		list.add(infoPushService.getLastedItem(recentItem));
		//引入PageHelper分页插件,在查询之前只需调用,传入页码，以及每页多少条数据，后面紧跟的查询就是分页查询
		PageHelper.startPage(1, 5);
		//使用PageInfo包装查好的结果，只需将pageInfo交给页面，
		//分装了详细的分页信息和查询出的数据,连续显示的页数4
		PageInfo page = new PageInfo(list, 4);
		return Message.success().add("pageInfo", page);
	}
	
	//获取智能推荐的猜你喜欢
		@RequestMapping("/recommendHobby")
		@ResponseBody
		public Message getRecHobby(HttpServletRequest request) {
			List<InfoResource> list = new ArrayList<InfoResource>();
			list = infoPushService.getRecHobby();
			PageHelper.startPage(1, 5);
			PageInfo page = new PageInfo(list, 1);
			System.out.println("智能推荐猜你喜欢  Controller");
			
			return Message.success().add("pageInfo", page);
		}
	
	//随机推送五项技能
	@RequestMapping("/randomRecommend")
	@ResponseBody
	public Message getRandomContent() {
		List<SearchResource> list = infoPushService.getContent();
		//System.out.println("randomRecommend1");
		
		System.out.println("randomRecommend Controller");
		//引入PageHelper分页插件,在查询之前只需调用,传入页码，以及每页多少条数据，后面紧跟的查询就是分页查询
		PageHelper.startPage(1, 5);
		//使用PageInfo包装查好的结果，只需将pageInfo交给页面，
		//分装了详细的分页信息和查询出的数据,连续显示的页数4
		PageInfo page = new PageInfo(list, 1);
		return Message.success().add("pageInfo", page);
	}
	//随机推送五项 猜你喜欢
	@RequestMapping("/randomGuessHobby")
	@ResponseBody
	public Message guessHobby() {
		List<InfoResource> list = new ArrayList<InfoResource>();
		list.addAll(infoPushService.guessRandomFive());
		System.out.println("guessHobby Controller");
		
		PageHelper.startPage(1, 5);
		PageInfo page = new PageInfo(list,1);
		
		return Message.success().add("pageInfo", page);
	}
}
