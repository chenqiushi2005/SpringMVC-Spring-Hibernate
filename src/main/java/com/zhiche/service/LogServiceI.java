package com.zhiche.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.zhiche.model.vo.DataGrid;
import com.zhiche.model.vo.Log;
import com.zhiche.model.vo.User;

public interface LogServiceI {

	public void beforeLog(JoinPoint point);

	public void afterLog(JoinPoint point);

	public Object aroundLog(ProceedingJoinPoint point);
	
	public DataGrid datagrid(Log log);

}
