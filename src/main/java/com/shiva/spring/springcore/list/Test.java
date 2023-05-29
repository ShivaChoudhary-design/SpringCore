package com.shiva.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author SCHOUDH9
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shiva/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println("Hospital Name:"+ hospital.getName());
		System.out.println(hospital.getDepartments());

	}

}
 