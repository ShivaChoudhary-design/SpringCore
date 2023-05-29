package com.shiva.spring.springcore.lc.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shiva/spring/springcore/lc/assignment/config.xml");
		TicketReservation ticket = (TicketReservation) context.getBean("ticket");
		System.out.println(ticket);
		context.registerShutdownHook();

	}

}
