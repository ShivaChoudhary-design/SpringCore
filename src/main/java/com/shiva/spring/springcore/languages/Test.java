package com.shiva.spring.springcore.languages;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/shiva/spring/springcore/languages/propertiesconfig.xml");
		CountriesandLanguages countriesAndLang = (CountriesandLanguages) context.getBean("countriesAndLangs");
		System.out.println(countriesAndLang);

	}

}
