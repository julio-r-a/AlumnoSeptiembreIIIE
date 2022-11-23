package com.idat.alumnomicroservicioiiie.controller;

import com.idat.alumnomicroservicioiiie.dto.AlumnoDTO;
import com.idat.alumnomicroservicioiiie.model.Alumno;
import com.idat.alumnomicroservicioiiie.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/alumno/v1")
public class AlumnoController {

    @Autowired
    private AlumnoService service;

    @GetMapping("/listar")
    public @ResponseBody List<AlumnoDTO> listar(){
        return service.listar();
    }

    @GetMapping("/listar/{id}")
    public @ResponseBody AlumnoDTO obtenerId(@PathVariable Integer id){
        return  service.obtenerId(id);
    }

    @PostMapping("/guardar")
    public @ResponseBody void guardar(@RequestBody AlumnoDTO dto){
        service.guardar(dto);
    }

    @PutMapping("/actualizar")
    public @ResponseBody void actualizar (@RequestBody AlumnoDTO dto){
        service.actualizar(dto);
    }

    @DeleteMapping("/eliminar/{id}")
    public @ResponseBody void eliminar(@PathVariable Integer id){
        service.eliminar(id);
    }

}
