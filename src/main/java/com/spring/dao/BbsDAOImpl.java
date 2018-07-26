package com.spring.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.vo.BbsVO;

@Repository
public class BbsDAOImpl implements BbsDAO{

	
	@Inject
	private SqlSession sqlSession;
	
	
	@Override
	public void insert(BbsVO bvo) throws Exception {
		sqlSession.insert("insert",bvo);
		
	}

	@Override
	public BbsVO read(Integer bid) throws Exception {
		
		return sqlSession.selectOne("read",bid);
	}

	@Override
	public void update(BbsVO bvo) throws Exception {
		sqlSession.update("update",bvo);
		
	}

	@Override
	public void delete(Integer bid) throws Exception {
		sqlSession.delete("delete",bid);
		
	}

	@Override
	public List<BbsVO> list() throws Exception {
		return sqlSession.selectList("list");
	}

}
