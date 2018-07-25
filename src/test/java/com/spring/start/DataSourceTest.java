package com.spring.start;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//실행할 클래스 지정
@RunWith(SpringJUnit4ClassRunner.class)

//읽어올 xml파일 위치를 어노테이션 이용해서 불러옴
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*.xml")


public class DataSourceTest {
	
		@Inject //root-context.xml 에 mybatis mysql 연동을 위한 빈(dataSource) 객체있음
		private DataSource dataSource;
	
		@Test
		public void testConnection() throws Exception{
			
			try(Connection conn = dataSource.getConnection()){
				
				System.out.println(conn); //com.mysql.cj.jdbc.ConnectionImpl@be68757
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	
	
}
