package com.shiva.springcore.constructor;

public class Employee {
	

	private int id;
	private Address address;

	public int getId() {
		return id;
	}

	public Employee(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

}
