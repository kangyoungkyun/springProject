package com.spring.start;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String writePost(BbsVO bvo, RedirectAttributes reAttr) throws Exception{
		logger.info("write POST.....");
		logger.info(bvo.toString());
		
		bsvc.write(bvo);
		//model.addAttribute("result", "게시글 등록완료");
		reAttr.addFlashAttribute("result","Success");
		return "redirect:/bbs/list";
	}
	
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void list(Model model) throws Exception{
		logger.info("글목록 가져오기");
		model.addAttribute("list", bsvc.list());
	}
	
	
	
}
