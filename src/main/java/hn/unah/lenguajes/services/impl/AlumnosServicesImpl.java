package hn.unah.lenguajes.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.models.Alumno;
import hn.unah.lenguajes.repositories.AlumnosRepository;
import hn.unah.lenguajes.services.AlumnosServices;


@Service
public class AlumnosServicesImpl implements AlumnosServices{
	
	@Autowired
	private AlumnosRepository alumnosRepositorio;

	@Override
	public List<Alumno> obtenerAlumnos() {
		return (List<Alumno>) alumnosRepositorio.findAll();
	}

	@Override
	public Alumno crearAlumno(Alumno alumno) {
		alumnosRepositorio.save(alumno);
		return alumno;
	}

	@Override
	public Alumno obtenerAlumno(int id) {
		return alumnosRepositorio.findById(id).orElse(null);
	}

	@Override
	public String eliminarAlumno(int id) {
		if(alumnosRepositorio.existsById(id)) {
			alumnosRepositorio.deleteById(id);
			return "Se eliminó correctamente";
		}
		return "No existe";
	}

	@Override
	public Alumno editarAlumno(int id, Alumno alumno) {
		Alumno alumnoActualizar = alumnosRepositorio.findById(id).orElse(null);

		if(alumnosRepositorio.existsById(id)) {
			
			if(alumno.getNombre() != null) {
				alumnoActualizar.setNombre(alumno.getNombre());
			}
			
			if(alumno.getApellido() != null) {
				alumnoActualizar.setApellido(alumno.getApellido());
			}
			
			if(alumno.getEdad() != 0) {
				alumnoActualizar.setEdad(alumno.getEdad());;
			}
			
			alumnosRepositorio.save(alumnoActualizar);
		}
		
		return alumnoActualizar;
	}

}

