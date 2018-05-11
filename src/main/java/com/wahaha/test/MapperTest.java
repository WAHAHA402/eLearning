package com.wahaha.test;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wahaha.bean.Employee;
import com.wahaha.bean.SearchContent;
import com.wahaha.bean.UserInfo;
import com.wahaha.dao.DepartmentMapper;
import com.wahaha.dao.EmployeeMapper;
import com.wahaha.dao.SearchContentMapper;
import com.wahaha.dao.UserInfoMapper;

/*
 * 测试dao层的工作
 * 推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
 * 1、导入SpringTest jar包
 * 2、@ContextConfiguration指定Spring配置文件的位置
 * 3、直接autowired要使用的组件即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MapperTest {
	@Autowired
	UserInfoMapper userInfoMapper;
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	SearchContentMapper searchContentMapper;
	@Autowired
	SqlSession sqlSession;
	
	@Test
	public void TestCRUD() {
		System.out.println(userInfoMapper);
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		System.out.println(uuid);
//		userInfoMapper.insertSelective(new UserInfo(uuid,"zrw666@qq.com","123456","","章","m",null,"zjnu",1));
//		searchContentMapper.insertSelective(new SearchContent(uuid, 0,0,0,0,0));
		
		//1.插入几个部门,此处有中文乱码，待解决
//		departmentMapper.insertSelective(new Department(null, "开发部"));
//		departmentMapper.insertSelective(new Department(null, "销售部"));
//		departmentMapper.insertSelective(new Department(null, "IT部"));
//		System.out.println("插入完成");
		
		//2.测试插入员工数据
//		employeeMapper.insertSelective(new Employee(null, "PP", "M", "PP@qq.com", 1));
//		System.out.println("插入完成");
		
//		//3、批量插入多个员工；批量，使用可以执行批量操作的sqlSession。
//		
////		for(){
////			employeeMapper.insertSelective(new Employee(null, , "M", "Jerry@atguigu.com", 1));
////		}
		
		System.out.println("正确完成");
		
		
	}
}
