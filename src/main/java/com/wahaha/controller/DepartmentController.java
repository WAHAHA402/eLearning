package com.wahaha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wahaha.bean.Department;
import com.wahaha.bean.Message;
import com.wahaha.service.DepartmentService;

/**
 * 处理和部门有关的请求
 * @author wahaha
 *
 */
@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	/**
	 * 返回所有的部门信息
	 */
	@RequestMapping("/depts")
	@ResponseBody
	public Message getDepts() {
		List<Department> list = departmentService.getDepts();
		return Message.success().add("depts", list);
	}
}
