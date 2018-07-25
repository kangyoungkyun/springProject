package com.spring.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoggerDemo {

	private static final Logger logger = LoggerFactory.getLogger(LoggerDemo.class);
	
	
	@RequestMapping("action1")
	public void action1() {
		logger.info("action1 호출....");
	}
	
	@RequestMapping("action2")
	public void action2() {
		logger.info("action2 호출....");
	}
}
