package com.zhiche.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiche.controller.BaseController;
import com.zhiche.model.vo.DataGrid;
import com.zhiche.model.vo.Json;
import com.zhiche.model.vo.Role;
import com.zhiche.service.RoleServiceI;
import com.zhiche.util.ExceptionUtil;

@Controller
@RequestMapping("/roleController")
public class RoleController extends BaseController{

	private static final Logger logger = Logger.getLogger(RoleController.class);
	
	@Autowired
	private RoleServiceI roleService;

	@RequestMapping("/role")
	public String role() {
		return "/admin/role";
	}

	@RequestMapping("/roleAdd")
	public String roleAdd() {
		return "/admin/roleAdd";
	}

	@RequestMapping("/roleEdit")
	public String roleEdit() {
		return "/admin/roleEdit";
	}
	
	@ResponseBody
	@RequestMapping("/add")
	public Json add(Role role) {
		Json j = new Json();
		try {
			roleService.add(role);
			j.setSuccess(true);
			j.setMsg("Add successfully");
		} catch (Exception e) {
			logger.error(ExceptionUtil.getExceptionMessage(e));
			j.setMsg("Add unsuccessfully");
		}
		return j;
	}

	@ResponseBody
	@RequestMapping("/edit")
	public Json edit(Role role) {
		Json j = new Json();
		try {
			roleService.edit(role);
			j.setSuccess(true);
			j.setMsg("Edit successfully");
		} catch (Exception e) {
			logger.error(ExceptionUtil.getExceptionMessage(e));
			j.setMsg("Edit unsuccessfully");
		}
		return j;
	}

	@ResponseBody
	@RequestMapping("/delete")
	public Json delete(Role role) {
		Json j = new Json();
		try {
			roleService.delete(role.getIds());
			j.setSuccess(true);
			j.setMsg("Delete successfully");
		} catch (Exception e) {
			logger.error(ExceptionUtil.getExceptionMessage(e));
			j.setMsg("Delete unsuccessfully");
		}
		return j;
	}

	@ResponseBody
	@RequestMapping("/datagrid")
	public DataGrid datagrid(Role role) {
		return roleService.datagrid(role);
	}
	
	@ResponseBody
	@RequestMapping("/doNotNeedSession_combobox")
	public List<Role> doNotNeedSession_combobox() {
		return roleService.combobox();
	}

}
