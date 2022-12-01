package com.goott.yourpro00.datasource01;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) // 톰캣이 없어도 있는것처럼 하는 것 1
@ContextConfiguration({ "file:src\\main\\webapp\\WEB-INF\\spring\\mybatis-context.xml" }) // 톰캣이 없어도 있는것처럼 하는 것 2
@Log4j
public class DataSourceTests {

	@Setter(onMethod_ =  @Autowired)
	private DataSource dataSource;
	
		@Test
		public void testConnection() {
		try {
			Connection con = dataSource.getConnection();
			log.info(con);
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}//testConnection
		
}//end
