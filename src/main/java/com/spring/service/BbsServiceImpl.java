package com.spring.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.spring.dao.BbsDAO;

import com.spring.vo.BbsVO;

@Service
public class BbsServiceImpl implements BbsService {

	private static final Logger logger = LoggerFactory.getLogger(BbsServiceImpl.class);
	
	@Inject
	private BbsDAO bdao;
	
	@Override
	public void write(BbsVO bvo) throws Exception {
		logger.info("write()...");
		bdao.insert(bvo);

	}

	@Override
	public BbsVO read(Integer bid) throws Exception {
		logger.info("read(Integer bid)...");
		return bdao.read(bid);
	}

	@Override
	public void modify(BbsVO bvo) throws Exception {
		logger.info("modify(BbsVO bvo)...");
		bdao.update(bvo);
	}

	@Override
	public void remove(Integer bid) throws Exception {
		logger.info("remove(Integer bid)...");
		bdao.delete(bid);

	}

	@Override
	public List<BbsVO> list() throws Exception {
		logger.info("list()...");
		return bdao.list();
	}

}
