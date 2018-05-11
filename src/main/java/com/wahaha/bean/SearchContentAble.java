package com.wahaha.bean;

import java.util.HashSet;
import java.util.Set;

public class SearchContentAble {
	/**
	 * 放置可搜索的内容集合,
	 * 以下方法命名中间单词只取两个字母
	 */
	Set<String> frontFoundationSet = new HashSet<>();
	Set<String> frontAdvanceSet = new HashSet<>();
	Set<String> backEndSet = new HashSet<>();
	Set<String> mobileDevelopSet = new HashSet<>();
	Set<String> database666Set = new HashSet<>();
	
	//前端基础集合
	public boolean isFrontFo(String string){
		frontFoundationSet.add("html");
		frontFoundationSet.add("css");
		frontFoundationSet.add("js");
		frontFoundationSet.add("javascript");
		
		if(frontFoundationSet.contains(string)) {
			return true;
		}
		return false;
	}
	
	//前端高级集合
	public boolean isFrontAd(String string) {
		frontAdvanceSet.add("html5");
		frontAdvanceSet.add("css3");
		frontAdvanceSet.add("node.js");
		frontAdvanceSet.add("angular.js");
		frontAdvanceSet.add("bootstrap");
		frontAdvanceSet.add("react.js");
		frontAdvanceSet.add("vue.js");
		frontAdvanceSet.add("sass");
		frontAdvanceSet.add("less");
		frontAdvanceSet.add("webapp");
		
		if(frontAdvanceSet.contains(string)) {
			return true;
		}
		return false;
	}
	
	//后端集合
	public boolean isBackEn(String string) {
		backEndSet.add("php");
		backEndSet.add("java");
		backEndSet.add("springboot");
		backEndSet.add("python");
		backEndSet.add("c");
		backEndSet.add("c++");
		backEndSet.add("go");
		backEndSet.add("c#");
		backEndSet.add("ruby");
		
		if(backEndSet.contains(string)) {
			return true;
		}
		return false;
	}
	
	//移动开发集合
	public boolean isMobileDe(String string) {
		mobileDevelopSet.add("android");
		mobileDevelopSet.add("ios");
		mobileDevelopSet.add("unity");
		mobileDevelopSet.add("cocos2d-x");
		
		if(mobileDevelopSet.contains(string)) {
			return true;
		}
		return false;
	}
	
	//数据库集合
	public boolean isDatabase666(String string) {
		database666Set.add("mysql");
		database666Set.add("mongodb");
		database666Set.add("oracle");
		database666Set.add("sql server");
		
		if(database666Set.contains(string)) {
			return true;
		}
		return false;
	}
}
