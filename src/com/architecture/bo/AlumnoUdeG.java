package com.architecture.bo;

public class AlumnoUdeG extends Alumno{
	private int studentId;
	private String bachelor;
	private int credits;
	private int currentCredAchieved;
	
	public AlumnoUdeG() {
	}
	
	public AlumnoUdeG(String name, String lastName, int age, int cellphone,
			int studentId, String bachelor, int credits, 
			int currentCredAchieved) {
		super();
		this.studentId=studentId;
		this.bachelor=bachelor;
		this.credits=credits;
		this.currentCredAchieved=currentCredAchieved;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}
	
	public String getBachelor() {
		return bachelor;
	}
	
	public void setBachelor(String bachelor) {
		this.bachelor=bachelor;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public void setCredits(int credits) {
		this.credits=credits;
	}
	
	public int getCurrentCredAchieved() {
		return currentCredAchieved;
	}
	
	public void setCurrentCredAchieved(int currentCredAchieved) {
		this.currentCredAchieved=currentCredAchieved;
	}
	
	@Override
	public String toString() {
		return "Name: " + super.getName() + "\nLast name: " + super.getLastName() +
				"Age: " + super.getAge() + "\nContact: " + super.getCellphone() +
				"\n" + "\nStudent ID: " + studentId + "\nBachelor: " + 
				bachelor + "\nCredits of the bachelor: " + credits +
				"\nCredits achieved: " + currentCredAchieved;
	}
	
}
