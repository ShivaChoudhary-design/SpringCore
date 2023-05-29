package com.shiva.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
	Employee emp = ctx.getBean(Employee.class);
		System.out.println("Employee Id:"+ emp.getId());
		System.out.println("Employee Name:"+ emp.getName());
		
		
	
	}
}
