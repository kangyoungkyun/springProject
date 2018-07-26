package com.spring.start;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.service.BbsService;
import com.spring.vo.BbsVO;

@Controller
@RequestMapping("/bbs/*")
public class BbsController {

	private static final Logger logger = LoggerFactory.getLogger(BbsController.class);
	
	
	@Inject
	private BbsService bsvc;
	
	@RequestMapping(value="/write", method = RequestMethod.GET)
	public void writeGET(BbsVO bvo, Model model) throws Exception{
		logger.info("write GET.....");
	}
	
	
	@RequestMapping(value="/write", method = RequestMethod.POST)
	public String writePost(BbsVO bvo, Model model) throws Exception{
		logger.info("write POST.....");
		return "/bbs/resultOK";
	}
	
	
	
	
}
