package com.idat.alumnomicroservicioiiie.repository;

import com.idat.alumnomicroservicioiiie.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
