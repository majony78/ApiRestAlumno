package com.api.alumnos.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.alumnos.model.entity.Alumno;

@Repository
public interface IAlumnoDAO extends JpaRepository<Alumno, Long>  {

}
