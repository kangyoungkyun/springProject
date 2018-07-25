package com.spring.start;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnection {

	
	String connectionString = "jdbc:mysql://localhost:3306/spring_prj?user=root&password=eorn1145&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
//	private static final String URL = "jdbc:mysql://192.168.0.13:3308/spring_prj";
//	private static final String USER = "root";
//	private static final String PWD = "eorn1145";
	
	//junit 테스트
	@Test
	public void testConn() throws Exception{
		
		Class.forName(DRIVER);
		
		try(Connection conn = DriverManager.getConnection(connectionString)){
			
			System.out.println(conn);
			//com.mysql.cj.jdbc.ConnectionImpl@4bb4de6a
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
