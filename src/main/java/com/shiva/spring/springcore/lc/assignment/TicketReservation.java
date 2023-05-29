package com.shiva.spring.springcore.lc.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@PostConstruct
	public void initialize() {
		System.out.println("init");

	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("destroy");
	}

	@Override
	public String toString() {
		return "TicketReservation [id=" + id + "]";
	}

}
