package com.springjdbc;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class App {

	public static void main(String[] args) {
		System.out.println("hiii");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Loaded");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
		
		System.out.println("hello");
		
		int rowCount = jdbcTemplate.update("INSERT INTO nani VALUES (?, ?)",String.valueOf("love"),"i");
		System.out.println(rowCount);
		System.out.println("nani");
		System.out.println("i love u");
		
		// read
		//createRowInDB(jdbcTemplate);
		//updateRowInDB(jdbcTemplate);
		//deleteRowInDB(jdbcTemplate);
		// read
		// DQL
		// selct * from emp where id=1;
		/*RowMapper<Employee> rMapper = (rs, r) -> {
			Employee emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			//emp.setSal(rs.getDouble(3));
			return emp;
		}*/
		
		
       
		
		//List<Employee> employee =  jdbcTemplate.query("select count(*) from emp where id=10 and name='swathi';", rMapper);
		//List<Employee> employee =  jdbcTemplate.query("select id,name from emp where id>0", rMapper);
		
		//System.out.println("emp data is " + employee);
		/*for(Employee emp:employee) {
			if(emp.getId()>0) {
				System.out.println("hello");
			}
		}*/
		
	}
     //insert operation
	private static void createRowInDB(JdbcTemplate jdbcTemplate) {
		int rowsUpdated = jdbcTemplate.update("insert into emp values(?,?,?)", Integer.valueOf(255), "HK", 1256.3);
		System.out.println("rows inserted " + rowsUpdated);
	}
	//update operation
	private static void updateRowInDB(JdbcTemplate jdbcTemplate) {
		int rowsUpdated = jdbcTemplate.update("update emp set id=?,name=?,sal=? where id=?", Integer.valueOf(2), "HK", 1256,1);
		System.out.println(rowsUpdated);
		
	}
	//delete operation
		private static void deleteRowInDB(JdbcTemplate jdbcTemplate) {
			int rowsUpdated = jdbcTemplate.update("delete from emp where id=?", Integer.valueOf(9));
			System.out.println(rowsUpdated);
			
		}
//select operation with dynamic data
List<Userpasvalid> employee =  jdbcTemplate.query("select count(*) from userpasvalid where username=? and password=?;",new Object[] {"swathi62@gmail.com","swathi123"}, rMapper);


}
