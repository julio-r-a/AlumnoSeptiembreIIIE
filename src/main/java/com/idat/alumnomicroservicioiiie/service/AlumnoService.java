package com.idat.alumnomicroservicioiiie.service;

import com.idat.alumnomicroservicioiiie.dto.AlumnoDTO;
import com.idat.alumnomicroservicioiiie.model.Alumno;

import java.util.List;

public interface AlumnoService {

    List<AlumnoDTO>listar();
    AlumnoDTO obtenerId(Integer id);
    void guardar(AlumnoDTO alumno);
    void eliminar(Integer id);
    void actualizar(AlumnoDTO alumno);
}
