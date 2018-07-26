package com.spring.start;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.dao.BbsDAO;
import com.spring.vo.BbsVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class BbsDAOTest {

	@Inject
	private BbsDAO bdao;
	
	private static Logger logger = LoggerFactory.getLogger(BbsDAOTest.class);
	
	
//	@Test
//	public void insertTest() throws Exception{
//		BbsVO bvo = new BbsVO();
//		bvo.setSubject("제목 테스트");
//		bvo.setContent("내용 테스트");
//		bvo.setWriter("강영균");
//		bdao.insert(bvo);
//	}
	
	
//	@Test
//	public void readTest() throws Exception{
//		logger.info(bdao.read(1).toString());
//	}
	
	
	
//	@Test
//	public void updateTest() throws Exception{
//		BbsVO bvo = new BbsVO();
//		bvo.setBid(1);
//		bvo.setSubject("수정 후 테스트 제목");
//		bvo.setContent("수정 테스트 내용");
//		bdao.update(bvo);
//	}
	
	@Test
	public void listTest() throws Exception{
		logger.info(bdao.list().toString());
	}
	
	
	
}
