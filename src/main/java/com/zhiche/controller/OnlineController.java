package com.zhiche.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiche.controller.BaseController;
import com.zhiche.model.vo.DataGrid;
import com.zhiche.model.vo.Online;
import com.zhiche.service.OnlineServiceI;

@Controller
@RequestMapping("/onlineController")
public class OnlineController extends BaseController {

	@Autowired
	private OnlineServiceI onlineService;

	@RequestMapping("/doNotNeedSession_onlineDatagrid")
	@ResponseBody
	public DataGrid doNotNeedSession_onlineDatagrid(Online online) {
		return onlineService.datagrid(online);
	}

}
