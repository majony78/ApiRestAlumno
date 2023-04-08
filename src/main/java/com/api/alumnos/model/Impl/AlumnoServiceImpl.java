package com.api.alumnos.model.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.alumnos.model.dao.IAlumnoDAO;
import com.api.alumnos.model.entity.Alumno;
import com.api.alumnos.model.service.IAlumnoService;

@Service
public class AlumnoServiceImpl implements IAlumnoService {
	
	
	@Autowired
	private IAlumnoDAO alumnoDAO;

	@Override
	public List<Alumno> getAlumnos() {
		
		return alumnoDAO.findAll() ;
	}

	@Override
	public Alumno findAlumnoById(Long id) {
		
		return alumnoDAO.findById(id).orElse(null);
	}

	@Override 
	public Alumno saveAlumno(Alumno alumno) {
		return alumnoDAO.save(alumno);
	}

	@Override
	public void delete(Long id) {
		alumnoDAO.deleteById(id);
	}

}
