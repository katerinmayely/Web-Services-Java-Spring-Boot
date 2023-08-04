package hn.unah.lenguajes.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="alumnos")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
	
	@Id
	private int id;

	private String nombre;

	private String apellido;
	
	private int edad;

}

