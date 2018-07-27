package com.spring.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CommonExceptionAdvice {

	
		private static final Logger logger = 
				LoggerFactory.getLogger(CommonExceptionAdvice.class);
		
		
		
		@ExceptionHandler(Exception.class)
		private ModelAndView errMAV(Exception e) {
			
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/err_exception");
			mav.addObject("exception",e);
			
			return mav;
		}
		
	
}
