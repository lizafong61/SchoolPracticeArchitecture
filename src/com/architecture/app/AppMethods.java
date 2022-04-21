package com.architecture.app;
import com.architecture.bo.*;

public class AppMethods {
	
	public void universitySelection(String university) {
		
		if(university.equals("udeg")) {
			System.out.println("Welcome to: " + "\nUniversidad de Guadalajara");
		}else if(university.equals("itson")){
			System.out.println("Welcome to: " + 
		"\nInstituto Tecnologico de Sonora");
		}else if(university.equals("itlm")) {
			System.out.println("Welcome to: " + 
		"\nInstituto Tecnologico de Los Mochis");
		} else {
			System.out.println("Invalid University");
			System.exit(0);
		}
	}
	
	public void usrRequest(String university, String request, String name, 
			String lastName, int age, int cellphone, int studentId, 
			String bachelor,String gradeOfStudy, String areaOfStudy,
			int credits, int currentCredAchieved) {
		if(university.equals("udeg")){
			udegRequest(request,name,lastName,age,cellphone,studentId,bachelor,
					credits,currentCredAchieved);
		}else if(university.equals("itson")) {
			itsonRequest(request,name,lastName,age,cellphone,studentId,
					gradeOfStudy,areaOfStudy, credits,currentCredAchieved);
		} else if(university.equals("itlm")) {
			
		}
	}
	
	public void udegRequest(String request, String name, String lastName, 
			int age, int cellphone, int studentId, String bachelor, 
			int creditsOfBachelor, int currentCredAchieved) {
		UniversidadServices universityServicesUdeG = new UniversidadServices();
		
		if(request.equals("add student")) {
			AlumnoUdeG myUdeGStudent = new AlumnoUdeG(name,lastName,age,
					cellphone,studentId,bachelor,creditsOfBachelor,
					currentCredAchieved);
			universityServicesUdeG.ingresarAlumno(myUdeGStudent);
			System.out.print("Student added successfuly");
		}else if(request.equals("remove student")){
			for(Alumno myStudent: universityServicesUdeG.listaAlumnos()) {
				if(myStudent.getName().toLowerCase().equals(name) && 
						myStudent.getLastName().toLowerCase().equals(lastName)) {
					universityServicesUdeG.removerAlumno(myStudent);
					System.out.print("Student removed successfuly");
				} else {
					System.out.println("Student not found");
				}
			}
		}else if (request.equals("get students lists")) {
			universityServicesUdeG.listaAlumnos();
		}
	}
	
	public void itsonRequest(String request, String name, String lastName,
			int age, int cellphone, int studentId, String gradeOfStudy,
			String areaOfStudy, int credits, int currentCredAchieved) {
		UniversidadServices universityServicesITSON = new UniversidadServices();
		
		if(request.equals("add student")) {
			AlumnoITSON myITSONStudent = new AlumnoITSON(name,lastName,age,
					cellphone,studentId,gradeOfStudy,areaOfStudy,credits,
					currentCredAchieved);
			universityServicesITSON.ingresarAlumno(myITSONStudent);
			System.out.print("Student added successfuly");
		}else if(request.equals("remove student")) {
			for(Alumno myStudent: universityServicesITSON.listaAlumnos()) {
				if(myStudent.getName().toLowerCase().equals(name) && 
						myStudent.getLastName().toLowerCase().equals(lastName)) {
					universityServicesITSON.removerAlumno(myStudent);
					System.out.print("Student removed successfuly");
				} else {
					System.out.println("Student not found");
				}
			}
		} else if(request.equals("get students lists")) {
			universityServicesITSON.listaAlumnos();
		}
		
	}
	
	
	
	
}
