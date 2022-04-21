package com.architecture.bo;

public class AlumnoITLM extends Alumno{
	private int idOfStudent;
	private String course;
	private int courseId;
	private int creditsOfCourse;
	private int currentCredAchieved;
	
	public AlumnoITLM(){
	}
	
	public AlumnoITLM(String name, String lastName, int age, int cellphone,
			int idOfStudent, String course, int courseId,
			int creditsOfCourse, int currentCredAchieved) {
		super();
		this.idOfStudent=idOfStudent;
		this.course=course;
		this.courseId=courseId;
		this.creditsOfCourse=creditsOfCourse;
		this.currentCredAchieved=currentCredAchieved;
	}
	
	public int getIdOfStudent() {
		return idOfStudent;
	}
	
	public void setIdOfStudent(int idOfStudent) {
		this.idOfStudent=idOfStudent;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course=course;
	}
	
	public int getCourseId() {
		return courseId;
	}
	
	public void setCourseId(int courseId) {
		this.courseId=courseId;
	}
	
	public int getCreditsOfCourse() {
		return creditsOfCourse;
	}
	
	public void setCreditsOfCourse(int creditsOfCourse) {
		this.creditsOfCourse=creditsOfCourse;
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
				"\n" + "\nStudent ID: " + idOfStudent + "\nCourse: " + 
				course + "\nCredits of the course: " + creditsOfCourse +
				"\nCredits achieved: " + currentCredAchieved;
	}
	
}
