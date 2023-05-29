package com.shiva.spring.springcore.ls.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shiva/spring/springcore/ls/interfaces/config.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient.getId());
		context.registerShutdownHook();

	}

}
