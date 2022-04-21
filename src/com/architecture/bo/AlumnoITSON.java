package com.architecture.bo;

public class AlumnoITSON extends Alumno{
	private int studentId;
	private String gradeOfStudy;
	private String areaOfStudy;
	private int credits;
	private int currentCredAchieved;
	
	public AlumnoITSON() {
	}
	
	public AlumnoITSON(String name, String lastName, int age, int cellphone,
			int studentId, String gradeOfStudy,String areaOfStudy, int credits,
			int currentCredAchieved) {
		super();
		this.studentId=studentId;
		this.gradeOfStudy=gradeOfStudy;
		this.areaOfStudy=areaOfStudy;
		this.credits=credits;
		this.currentCredAchieved=currentCredAchieved;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}
	
	public String getGradeOfStudy() {
		return gradeOfStudy;
	}
	
	public void setGradeOfStudy(String gradeOfStudy) {
		this.gradeOfStudy=gradeOfStudy;
	}
	
	public String getAreaOfStudy() {
		return areaOfStudy;
	}
	
	public void setAreaOfStudy(String areaOfStudy) {
		this.areaOfStudy=areaOfStudy;
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
				"\n" + "\nStudent ID: " + studentId + "\nGrade of Study: " + 
				gradeOfStudy +"\nArea of Study:"+ areaOfStudy 
				+ "\nCredits:: " + credits +
				"\nCredits achieved: " + currentCredAchieved;
	}
	
}
