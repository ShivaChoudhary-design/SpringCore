package com.shiva.spring.springcore.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shiva/spring/springcore/Assignment/listconfig.xml");
		ShoppingCart shoppingcart = (ShoppingCart) context.getBean("shoppingcart");
		System.out.println(shoppingcart.getItem());

	}

}
