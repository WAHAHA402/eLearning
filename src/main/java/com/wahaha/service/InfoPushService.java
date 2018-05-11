package com.wahaha.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wahaha.bean.InfoResource;
import com.wahaha.bean.InfoResourceExample;
import com.wahaha.bean.SearchResource;
import com.wahaha.bean.SearchResourceExample;
import com.wahaha.bean.SearchResourceExample.Criteria;
import com.wahaha.dao.InfoResourceMapper;
import com.wahaha.dao.SearchResourceMapper;

@Service
public class InfoPushService {
	@Autowired
	SearchResourceMapper searchResourceMapper;
	@Autowired
	InfoResourceMapper infoResourceMapper;
	//根据搜索内容查询结果
	public List<SearchResource> getAll(String content){
		SearchResourceExample example = new SearchResourceExample();
		Criteria criteria = example.createCriteria();
		criteria.andTitleLike("%" + content + "%");
		
		List<SearchResource> items = searchResourceMapper.selectByExample(example);
		return items;
	}
	
	//根据最新搜索结果随机推送属于其同类别的一项技能
	public SearchResource getLastedItem(Integer technologyType) {
		SearchResourceExample example = new SearchResourceExample();
		example.createCriteria().andTypeEqualTo(technologyType);
		List<SearchResource> items = searchResourceMapper.selectByExample(example);
		return items.get((int)Math.random()*items.size());
	}
	
	//根据最大搜索类别推送相关技能4项
	public List<SearchResource> getMaxItems(Integer technologyType){
		SearchResourceExample example = new SearchResourceExample();
		example.createCriteria().andTypeEqualTo(technologyType);
		List<SearchResource> src = searchResourceMapper.selectByExample(example);
		//根据结果数随机生成不重复的四条搜索结果
		Set<Integer> set = new HashSet<Integer>();
		while(true) {
			set.add((int) (Math.random()*src.size()));
			if(set.size()==4) {
				break;
			}
		}
		List<SearchResource> src2 =new ArrayList<SearchResource>();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			src2.add(src.get(it.next()));
		}
		return src2;
	}
	//随机推送五项技能
	public List<SearchResource> getContent(){
		List<SearchResource> src = searchResourceMapper.selectByExample(null);
		//随机选取五个不重复的整数
		Set<Integer> set = new HashSet<Integer>();
		while(true) {
			set.add((int)(Math.random()*src.size()));
			if(set.size()==5) {
				break;
			}
		}
		List<SearchResource> src2 = new ArrayList<>();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			src2.add(src.get((int)it.next()));
		}
		System.out.println(src2);
		return src2;
	}
	
//	SearchResourceExample example = new SearchResourceExample();
//	example.createCriteria().andTypeEqualTo(technologyType);
//	List<SearchResource> items = searchResourceMapper.selectByExample(example);
//	return items.get((int)Math.random()*items.size());
	
	//推送 猜你喜欢
	public List<InfoResource> getRecHobby(){
		
		InfoResourceExample example1 = new InfoResourceExample();
		InfoResourceExample example2 = new InfoResourceExample();
		InfoResourceExample example3 = new InfoResourceExample();
		//随机一项城市：北京
		example1.createCriteria().andTypeEqualTo(3);
		List<InfoResource> irc1 = infoResourceMapper.selectByExample(example1);
		//总的list
		List<InfoResource> irc007 = new ArrayList<>();
		irc007.add(irc1.get((int) (Math.random()*irc1.size())));
		
		//随机两项书籍： 传记类
		example2.createCriteria().andTypeEqualTo(2);
		List<InfoResource> irc2 = infoResourceMapper.selectByExample(example2);
		Set<Integer> set2 = new HashSet<Integer>();
		while(true) {
			set2.add((int)(Math.random()*irc2.size()));
			if(set2.size()==2) {
				break;
			}
		}
		Iterator it2 = set2.iterator();
		while(it2.hasNext()) {
			irc007.add(irc2.get((int) it2.next()));
		}
		
		//随机两项： 经济
		example3.createCriteria().andTypeEqualTo(6);
		List<InfoResource> irc3 = infoResourceMapper.selectByExample(example3);
		Set<Integer> set3 = new HashSet<Integer>();
		while(true) {
			set3.add((int)(Math.random()*irc3.size()));
			if(set3.size()==2) {
				break;
			}
		}
		Iterator it3 = set3.iterator();
		while(it3.hasNext()) {
			irc007.add(irc3.get((int) it3.next()));
		}
		
		return irc007;
	}
	
	//随机推送五项 猜你喜欢
	public List<InfoResource> guessRandomFive(){
		List<InfoResource> irc = new ArrayList<InfoResource>();
		irc = infoResourceMapper.selectByExample(null);
		//随机选取五个不重复的整数
		Set<Integer> set = new HashSet<Integer>();
		while(true) {
			set.add((int)(Math.random()*irc.size()));
			if(set.size()==5) {
				break;
			}
		}
		List<InfoResource> irc2 = new ArrayList<InfoResource>();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			irc2.add(irc.get((int) it.next()));
		}
		System.out.println(irc2);
		return irc2;
	}
}
