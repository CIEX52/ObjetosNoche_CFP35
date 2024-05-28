package ar.org.centro35.colegio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlumnoController {
    
    @GetMapping("/alumnos")
    public String getAlumnos() {
        return "alumnos";
    }
}
