package com.spring.start;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//실행할 클래스 지정
@RunWith(SpringJUnit4ClassRunner.class)

//읽어올 xml파일 위치를 어노테이션 이용해서 불러옴
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})


public class MybatisTest {

	
	@Inject
	private SqlSessionFactory sqlFactory;
	
	
	//sql팩토리 객체 얻기
	@Test
	public void testSqlFactory() {
		System.out.println(sqlFactory);
		//org.apache.ibatis.session.defaults.DefaultSqlSessionFactory@5c7933ad
	}
	
	//sql session template 객체 얻기
	@Test
	public void sessionTest() throws Exception{
		try(SqlSession sqlSessionTemplate = sqlFactory.openSession()){
			System.out.println(sqlSessionTemplate);
			//org.apache.ibatis.session.defaults.DefaultSqlSession@50378a4
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
