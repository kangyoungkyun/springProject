package com.spring.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.spring.service.BbsServiceImpl;
import com.spring.vo.BbsVO;

@Repository
public class BbsDAOImpl implements BbsDAO{

	private static final Logger logger = LoggerFactory.getLogger(BbsDAOImpl.class);
	
	@Inject
	private SqlSession sqlSession;
	
	
	@Override
	public void insert(BbsVO bvo) throws Exception {
		logger.info("insert(BbsVO bvo)");
		sqlSession.insert("insert",bvo);
		
	}

	@Override
	public BbsVO read(Integer bid) throws Exception {
		logger.info("read(Integer bid)");
		return sqlSession.selectOne("read",bid);
	}

	@Override
	public void update(BbsVO bvo) throws Exception {
		logger.info("update(BbsVO bvo)");
		sqlSession.update("update",bvo);
		
	}

	@Override
	public void delete(Integer bid) throws Exception {
		logger.info("delete(Integer bid)");
		sqlSession.delete("delete",bid);
		
	}

	@Override
	public List<BbsVO> list() throws Exception {
		logger.info("list()");
		return sqlSession.selectList("list");
	}

}
