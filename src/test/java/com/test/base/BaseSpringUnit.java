package com.test.base;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-core.xml","classpath:spring-hibernate.xml" })
@Transactional
public class BaseSpringUnit {

	private static final Logger logger = Logger.getLogger(BaseSpringUnit.class);
	
	@Test
	public void test1() {
		logger.error("test");
	}
}
