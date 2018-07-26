package com.spring.dao;

import java.util.List;

import com.spring.vo.BbsVO;

public interface BbsDAO {

	
	//삽입
	public void insert(BbsVO bvo) throws Exception;
	
	//글 하나 읽어오기
	public BbsVO read(Integer bid) throws Exception;
	
	//수정
	public void update(BbsVO bvo) throws Exception;
	
	//삭제
	public void delete(Integer bid) throws Exception;

	//리스트
	public List<BbsVO> list() throws Exception;

}
