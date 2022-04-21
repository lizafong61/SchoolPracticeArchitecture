package com.architecture.bo;


import java.util.List;

public interface IUniversidad {
	public void ingresarAlumno(Alumno alumno);
	public void removerAlumno(Alumno alumno);
	
	public List<Alumno> listaAlumnos();
}
