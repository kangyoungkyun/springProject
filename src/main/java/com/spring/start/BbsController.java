package com.spring.start;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.service.BbsService;
import com.spring.vo.BbsVO;

@Controller
@RequestMapping("/bbs/*")
public class BbsController {

	private static final Logger logger = LoggerFactory.getLogger(BbsController.class);
	
	
	@Inject
	private BbsService bsvc;
	
	//http://localhost:8089/bbs/write 주소창에 입력했을 때 이곳에서 받고 -> write.jsp 페이지 보여준다.
	@RequestMapping(value="/write", method = RequestMethod.GET)
	public void writeGET(BbsVO bvo, Model model) throws Exception{
		logger.info("write GET.....");
	}
	
	
	//write.jsp 페이지에서 전송을 누르면 이곳에서 받는다.
	@RequestMapping(value="/write", method = RequestMethod.POST)
	public String writePost(BbsVO bvo, RedirectAttributes reAttr) throws Exception{
		logger.info("write POST.....");
		logger.info(bvo.toString());
		
		//서비스에 다녀온다. 
		bsvc.write(bvo);
		

		reAttr.addFlashAttribute("result","Success");
		
		
		// /bbs/list 페이지로 이동시킨다.
		return "redirect:/bbs/list";
	}
	
	//목록
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void list(Model model) throws Exception{
		logger.info("글목록 가져오기");
		model.addAttribute("list", bsvc.list());
	}
	
	
	//상세보기 
	//@RequestParam : Servlet에서 request.getParameter()와 유사한 기능이다.
	//Servlet의 request 는 HttpServletRequest
	//@RequestParam 과 HttpServletRequest 의 차이점 : 문자열, 숫자, 날짜 등의 변환 여부다.
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public void read(@RequestParam("bid") int bid, Model model) throws Exception{
		model.addAttribute(bsvc.read(bid)); //addAttribute에 key를 사용하지 않았을 경우 key는 클래스의 이름을 자동으로 소문자로 시작해서 사용한다.
	}
	
	
	//삭제
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(@RequestParam("bid") int bid, RedirectAttributes reAttr)throws Exception{
		
		bsvc.remove(bid);
		
		reAttr.addFlashAttribute("result", "Delete Success!!");
		
		return "redirect:/bbs/list";
	}
	
	
	//수정 페이지
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public void modifyGET(int bid, Model model) throws Exception{
		model.addAttribute(bsvc.read(bid));
	}
	
	
	
	//수정처리
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modifyPOST(BbsVO bvo, RedirectAttributes reAttr)throws Exception {
		logger.info("modifyPOST().....");
		bsvc.modify(bvo);
		reAttr.addFlashAttribute("result", "success");
		return "redirect:/bbs/list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
