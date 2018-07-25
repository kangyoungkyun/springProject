package com.spring.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.vo.MemberVO;


// MemberDAO를 구현하는 함수
@Repository
public class MemberDAOImpl implements MemberDAO {

	//주입
	@Inject
	private SqlSession sqlSession;
	
	//getTime() 시간 리턴 함수
	@Override
	public String getTime() {
		
		return sqlSession.selectOne("getTime");
	}

	@Override
	public void insertMember(MemberVO mvo) {
		
		sqlSession.insert("insertMember",mvo);
			
	}

}
