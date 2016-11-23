package com.test.service;

import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.base.BaseSpringUnit;
import com.zhiche.dao.BaseDaoI;
import com.zhiche.model.po.Tauth;
import com.zhiche.model.vo.Auth;
import com.zhiche.service.AuthServiceI;

public class AuthServiceITest extends BaseSpringUnit{

	@Autowired
	private AuthServiceI authServiceI;
	
	private BaseDaoI<Tauth> authDao; 
	
	@Test
	public void testAdd() {
		Auth a = new Auth();
		a.setCid("fdsafdsa");
		a.setCname("fdsa");
		this.authServiceI.add(a);
	}

	@Test
	public void testEdit() {
		
	}

	@Test
	public void testDelete() {
		
	}

	@Test
	public void testTreegrid() {
		
	}

	@Test
	public void testTree() {
		
	}

}
