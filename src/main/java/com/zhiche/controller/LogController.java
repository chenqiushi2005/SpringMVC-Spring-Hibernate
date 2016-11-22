package com.zhiche.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiche.controller.BaseController;
import com.zhiche.model.vo.DataGrid;
import com.zhiche.model.vo.Log;
import com.zhiche.service.LogServiceI;

@Controller
@RequestMapping("/logController")
public class LogController extends BaseController{

	private static final Logger logger = Logger.getLogger(LogController.class);
	
	@Autowired
	private LogServiceI logService;

	@RequestMapping("/log")
	public String log() {
		return "/admin/log";
	}
	
	@ResponseBody
	@RequestMapping("/datagrid")
	public DataGrid datagrid(Log log) {
		return logService.datagrid(log);
	}
}
