package com.zhiche.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiche.controller.BaseController;
import com.zhiche.service.RepairServiceI;

@Controller
@RequestMapping("/repairController")
public class RepairController extends BaseController{

	@Autowired
	private RepairServiceI repairService;
	
	@RequestMapping("/doNotNeedSession_repairAction")
	public String doNotNeedSession_repairAction() {
		repairService.repair();
		return "redirect:/";
	}

	@RequestMapping("/doNotNeedSession_deleteAndRepair")
	public String doNotNeedSession_deleteAndRepair() {
		repairService.deleteAndRepair();
		return "redirect:/";
	}
}
