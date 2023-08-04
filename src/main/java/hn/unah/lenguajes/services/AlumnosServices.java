package hn.unah.lenguajes.services;

import java.util.List;

import hn.unah.lenguajes.models.Alumno;

public interface AlumnosServices {
	
	public List<Alumno> obtenerAlumnos();
	public Alumno crearAlumno(Alumno alumno);
	public Alumno obtenerAlumno(int id);
	public String eliminarAlumno(int id);
	public Alumno editarAlumno(int id, Alumno alumno);
	
}
