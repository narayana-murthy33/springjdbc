package com.springjdbc;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Pasvalid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		passwordl();
		

	}

	public static void passwordl() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Loaded");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		//System.out.println("Got template");
		
		// read

		int rowCount = jdbcTemplate.update("insert into nani values (?, ?)",String.valueOf("nani"),"sita");
		System.out.println(rowCount);
		System.out.println("nani");
		
		System.exit(0);
		RowMapper<Userpasvalid> rMapper = (rs, r) -> {
			Userpasvalid emp = new Userpasvalid();
			emp.setId(rs.getInt(1));
			//emp.setName(rs.getString(2));
			//emp.setSal(rs.getDouble(3));
			return emp ;
		};
		List<Userpasvalid> employee =  jdbcTemplate.query("select count(*) from userpasvalid where username=? and password=?;",new Object[] {"swathi62@gmail.com","swathi123"}, rMapper);
		System.out.println(employee);
		for(Userpasvalid temp:employee) {
			if(temp.getId()>0) {
				System.out.println("your login is usccessfull");
				
			}
		}
	}

}
