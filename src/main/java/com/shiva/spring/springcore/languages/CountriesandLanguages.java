package com.shiva.spring.springcore.languages;

import java.util.Properties;

public class CountriesandLanguages {

	private Properties countryAndLang;

	public Properties getCountryAndLang() {
		return countryAndLang;
	}

	public void setCountryAndLang(Properties countryAndLang) {
		this.countryAndLang = countryAndLang;
	}

	@Override
	public String toString() {
		return "CountriesandLanguages [countryAndLang=" + countryAndLang + "]";
	}

}
