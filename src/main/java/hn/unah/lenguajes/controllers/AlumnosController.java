package hn.unah.lenguajes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.models.Alumno;
import hn.unah.lenguajes.services.impl.AlumnosServicesImpl;

@RestController
@RequestMapping("/alumnos")
public class AlumnosController {
	
	@Autowired
	private AlumnosServicesImpl alumnoServicesImplementacion;
	
	@GetMapping("/")
	public List<Alumno> obtenerAlumnos(){
		return alumnoServicesImplementacion.obtenerAlumnos();
	}
	
	@PostMapping("/crear")
	public Alumno crearCliente(@RequestBody Alumno alumno) {
		return alumnoServicesImplementacion.crearAlumno(alumno);
	}
	
	@GetMapping("/buscar/{id}")
	public Alumno buscarPorId(@PathVariable int id) {
		return alumnoServicesImplementacion.obtenerAlumno(id);
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminarAlumno(@PathVariable int id) {
		return alumnoServicesImplementacion.eliminarAlumno(id);
	}
	
	@GetMapping("/actualizar/{id}")
	public Alumno actualizarAlumno(@PathVariable int id, @RequestBody Alumno alumno) {
		return alumnoServicesImplementacion.editarAlumno(id, alumno);
	}
}

