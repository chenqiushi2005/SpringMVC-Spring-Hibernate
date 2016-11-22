package com.zhiche.service;

import com.zhiche.model.vo.DataGrid;
import com.zhiche.model.vo.Online;

public interface OnlineServiceI {

	public void saveOrUpdateTonlineByLoginNameAndIp(String loginName, String ip);

	public void deleteTonlineByLoginNameAndIp(String loginName, String ip);

	public DataGrid datagrid(Online online);

}
