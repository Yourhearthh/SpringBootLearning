package com.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringbootLoggingApplicationTests {

	//记录器
	Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	void contextLoads() {
		//日记级别，由低到高trace<....
		logger.trace("这个是trace日志");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}

}
