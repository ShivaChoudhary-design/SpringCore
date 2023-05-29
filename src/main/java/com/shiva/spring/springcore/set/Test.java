package com.shiva.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shiva/spring/springcore/set/setconfig.xml");
		
		CarDealer cardealer = (CarDealer)context.getBean("cardealer");
		System.out.println("CarDealer: "+ cardealer.getName());
		System.out.println(cardealer.getModels());
	}

}
