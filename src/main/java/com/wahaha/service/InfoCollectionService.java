package com.wahaha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wahaha.bean.SearchContent;
import com.wahaha.dao.SearchContentMapper;

@Service
public class InfoCollectionService {
	@Autowired
	SearchContentMapper searchContentMapper;
	
	//根据用户id查询其搜索内容
	public SearchContent selectSearchContent(SearchContent searchContent) {
		SearchContent searchContent2 = searchContentMapper.selectByPrimaryKey(searchContent.getUserid());
		return searchContent2;
	}
	
	//更新用户搜索内容所属类别的值
	public void updateClickContent(SearchContent searchContent) {
		searchContentMapper.updateByPrimaryKeySelective(searchContent);
	}
	
	//更新
}
