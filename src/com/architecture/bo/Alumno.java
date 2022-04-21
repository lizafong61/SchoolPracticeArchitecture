package com.architecture.bo;

public abstract class Alumno {
	private String name;
	private String lastName;
	private int age;
	private int cellphone;
	
	public Alumno() {}
	
	public Alumno(String name, String lastName, int age, int cellphone) {
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.cellphone=cellphone;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getCellphone() {
		return cellphone;
	}
	
	public void setCellphone(int cellphone) {
		this.cellphone=cellphone;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nLast name: " + lastName +
				"\nAge: " + age + "Contact number: " + cellphone;
	}

}
