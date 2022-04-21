package com.architecture.bo;

import java.util.ArrayList;
import java.util.List;


public class UniversidadServices implements IUniversidad{
	List<Alumno> myStudents = new ArrayList<Alumno>();
	
	@Override
	public void ingresarAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		myStudents.add(alumno);
		
	}
	
	@Override
	public void removerAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		myStudents.remove(alumno);
	}
	
	@Override
	public List<Alumno> listaAlumnos() {
		// TODO Auto-generated method stub
		
		return this.myStudents;
	}

}
