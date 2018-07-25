package com.spring.dao;

import com.spring.vo.MemberVO;

public interface MemberDAO {
	//시간 반환
	public String getTime();
	
	//맴버 vo 객체 인자로 전달
	public void insertMember(MemberVO mvo);
}
