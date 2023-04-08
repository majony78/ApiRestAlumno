package com.api.alumnos.model.service;

import java.util.List;

import com.api.alumnos.model.entity.Alumno;

public interface IAlumnoService {
	
	List<Alumno> getAlumnos();
	Alumno findAlumnoById(Long id);
	Alumno saveAlumno(Alumno alumno);
	void delete(Long id);

}
