package com.wahaha.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wahaha.bean.Employee;
import com.wahaha.bean.Message;
import com.wahaha.service.EmployeeService;

/** @author wahaha
 *rest风格请求的URI（自己规定的）：
 *	/emp/{id}	GET 查询员工
 *	/emp		POST 保存员工
 *	/emp/{id}	PUT 修改员工
 *	/emp/{id}	DELETE 删除员工
 */
@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	
	//检查用户名是否可用
	@ResponseBody
	@RequestMapping("/checkuser")
	public Message checkUser(@RequestParam("empName")String empName) {
		//先判断用户名是否是合法的表达式
		String regex = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5})";
		if(!empName.matches(regex)) {
			return Message.fail().add("value_message","用户名必须是6-16位字母数字组合或2-5位中文");
		}
		boolean b =employeeService.checkUser(empName);
		if(b) {
			return Message.success();
		}else {
			return Message.fail().add("value_message","用户名不可用");
		}
		
	}
	/**
	 * 单个删除，批量删除二合一
	 * @param ids	批量删除情况：1-2-3-4-
	 * @return		单个删除情况：1
	 */
	@ResponseBody
	@RequestMapping(value="/emp/{ids}", method=RequestMethod.DELETE)
	public Message deleteEmpById(@PathVariable("ids")String ids) {
		//批量删除
		if(ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id的集合
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			employeeService.deleteBatch(del_ids);
		}else {//单个删除
			Integer id = Integer.parseInt(ids);
			employeeService.deleteEmp(id);
		}
		
		return Message.success();
	}
	//查询所有员工
	@RequestMapping("/emps")
	@ResponseBody
	public Message getEmpsWithJson(@RequestParam(value="pn",defaultValue="1")Integer pn) {
		//引入PageHelper分页插件,在查询之前只需调用,传入页码，以及每页多少条数据，后面紧跟的查询就是分页查询
				PageHelper.startPage(pn, 8);
				List<Employee> emps = employeeService.getAll();
				//使用PageInfo包装查好的结果，只需将pageInfo交给页面，
				//分装了详细的分页信息和查询出的数据,连续显示的页数6
				PageInfo page = new PageInfo(emps, 6);
				return Message.success().add("pageInfo", page);
	}
	//根据id查询单个员工,@PathVariable("id")表示从路径中取出id的值
	@RequestMapping(value="/emp/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Message getEmp(@PathVariable("id")Integer id) {
		Employee employee = employeeService.getEmp(id);
		
		return Message.success().add("emp", employee);
	}
	//更新员工
	@RequestMapping(value="/emp/{empId}",method=RequestMethod.PUT)
	@ResponseBody
	public Message updateEmp(Employee employee, HttpServletRequest request) {
		
		employeeService.updateEmp(employee);
		
		return Message.success();
	}
	//新增的员工保存,@Valid表示employee里的数据需按照employee属性指定的条件校验
	@RequestMapping(value="/emp", method=RequestMethod.POST)
	@ResponseBody
	public Message saveEmp(@Valid Employee employee,BindingResult result){
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
		employeeService.saveEmp(employee);
		return Message.success();
	}
	
//	//@RequestMapping("/emps")
//	public String getEmps(@RequestParam(value="pn",defaultValue="1")Integer pn,
//			Model model) {
//		//引入PageHelper分页插件,在查询之前只需调用,传入页码，以及每页多少条数据，后面紧跟的查询就是分页查询
//		PageHelper.startPage(pn, 8);
//		List<Employee> emps = employeeService.getAll();
//		//使用PageInfo包装查好的结果，只需将pageInfo交给页面，
//		//分装了详细的分页信息和查询出的数据,连续显示的页数6
//		PageInfo page = new PageInfo(emps, 6);
//		model.addAttribute("pageInfo", page);
//		
//		
//		return "list";
//	}
	
}
