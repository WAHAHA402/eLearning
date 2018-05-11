package com.wahaha.service;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wahaha.bean.InterestBook;
import com.wahaha.bean.InterestCity;
import com.wahaha.bean.InterestDirection;
import com.wahaha.bean.SearchContent;
import com.wahaha.bean.UserInfo;
import com.wahaha.bean.UserInfoExample;
import com.wahaha.bean.UserInfoExample.Criteria;
import com.wahaha.dao.InterestBookMapper;
import com.wahaha.dao.InterestCityMapper;
import com.wahaha.dao.InterestDirectionMapper;
import com.wahaha.dao.SearchContentMapper;
import com.wahaha.dao.UserInfoMapper;

@Service
public class AuthenticateService {
	@Autowired
	UserInfoMapper userInfoMapper;
	@Autowired
	InterestBookMapper interestBookMapper;
	@Autowired
	InterestCityMapper interestCityMapper;
	@Autowired
	InterestDirectionMapper interestDirectionMapper;
	@Autowired
	SearchContentMapper searchContentMapper;
	/*检验用户名是否可用
	 * count若等于0，表示该用户不存在
	 * */
	public boolean checkUserName(String email) {
		//mybatis的逆向工程中会生成实例及实例对应的example，example用于添加条件，相当where后面的部分
		// countByExample(example)根据查询条件统计出结果的数量
		//System.out.println("hello ");
		UserInfoExample example = new UserInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailEqualTo(email);
		long count =userInfoMapper.countByExample(example);
//		employeeMapper.countByExample(example);
		return count==0;
	}
	/*用户注册*/
	public void register(UserInfo userInfo,InterestBook interestBook,InterestCity interestCity,
			InterestDirection interestDirection,SearchContent searchContent) {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		
		userInfo.setId(uuid);
		userInfoMapper.insertSelective(userInfo);
		interestBook.setUserid(uuid);
		interestBookMapper.insertSelective(interestBook);
		interestCity.setUserid(uuid);
		interestCityMapper.insertSelective(interestCity);
		interestDirection.setUserid(uuid);
		interestDirectionMapper.insertSelective(interestDirection);
		searchContent.setUserid(uuid);
		searchContentMapper.insertSelective(searchContent);
	}
	//查看密码
	public boolean checkPassword(String email, String password, HttpSession session) {
		
		UserInfoExample example = new UserInfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailEqualTo(email);
		
		List<UserInfo> userInfo = userInfoMapper.selectByExample(example);
		if(userInfo.get(0).getPassword().equals(password)) {
			session.setAttribute("userId", userInfo.get(0).getId());
			return true;
		}
		return false;
	}
	
	//保存用户个人信息
	public void saveInfo(UserInfo user) {
		userInfoMapper.updateByPrimaryKeySelective(user);
	}
	
	//查看个人信息
	public UserInfo getInfo(String userId) {
		return userInfoMapper.selectByPrimaryKey(userId);
	}
}
