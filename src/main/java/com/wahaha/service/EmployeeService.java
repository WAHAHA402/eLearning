package com.wahaha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wahaha.bean.Employee;
import com.wahaha.bean.EmployeeExample;
import com.wahaha.bean.EmployeeExample.Criteria;
import com.wahaha.dao.EmployeeMapper;
@Service
public class EmployeeService {

	@Autowired
	EmployeeMapper employeeMapper;
	
	public List<Employee> getAll() {
		
		return employeeMapper.selectByExampleWithDepartment(null);
	}
	/*员工保存*/
	public void saveEmp(Employee employee) {
		
		employeeMapper.insertSelective(employee);
	}
	/*检验用户名是否可用
	 * count若等于0，则没有该用户名，可用
	 * */
	public boolean checkUser(String empName) {
		//mybatis的逆向工程中会生成实例及实例对应的example，example用于添加条件，相当where后面的部分
		// countByExample(example)根据查询条件统计出结果的数量
		EmployeeExample example = new EmployeeExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmpNameEqualTo(empName);
		long count =employeeMapper.countByExample(example);
		employeeMapper.countByExample(example);
		return count==0;
	}
	//查询单个员工
	public Employee getEmp(Integer id) {
		Employee employee = employeeMapper.selectByPrimaryKey(id);
		return employee;
	}
	//员工更新
	public void updateEmp(Employee employee) {
		employeeMapper.updateByPrimaryKeySelective(employee);
		
	}
	//员工单个删除
	public void deleteEmp(Integer id) {
		employeeMapper.deleteByPrimaryKey(id);
		
	}
	//员工批量删除
	public void deleteBatch(List<Integer> ids) {
		// TODO Auto-generated method stub
		EmployeeExample example = new EmployeeExample();
		Criteria criteria = example.createCriteria();
		//以下语句：delete from xxx where emp_id in(1,2,3)
		criteria.andEmpIdIn(ids);
		employeeMapper.deleteByExample(example);
	}

}
