package ar.org.centro35.colegio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import ar.org.centro35.colegio.entities.Curso;
import ar.org.centro35.colegio.enums.Dia;
import ar.org.centro35.colegio.enums.Turno;
import ar.org.centro35.colegio.repositories.CursoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class CursoController {

    private String mensaje="Ingrese un nuevo curso.";
    private CursoRepository cursoRepository= new CursoRepository();

    @GetMapping("/cursos")
    public String getCursos(Model model, @RequestParam(name = "buscar", defaultValue = "")String buscar) {
        // System.out.println("--------------------------------------------------");
        // System.out.println(buscar);
        // System.out.println("--------------------------------------------------");

        model.addAttribute("dias", Dia.values());
        model.addAttribute("turnos", Turno.values());
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("curso", new Curso());
        // model.addAttribute("cursos", cursoRepository.getAll());
        model.addAttribute("likeTitulo", cursoRepository.getLikeTitulo(buscar));
        return "cursos";
    }

    @PostMapping("/saveCurso")
    public String saveCurso(@ModelAttribute Curso curso) {
        // System.out.println("--------------------------------------------------");
        // System.out.println(curso);
        // System.out.println("--------------------------------------------------");
        cursoRepository.save(curso);
        if(curso.getId() > 0){
            mensaje="Curso guardado con éxito. "+curso.getId();;
        } else{
            mensaje="Ocurrió un error!! No se pudo guardar el curso.";
        }
        return "redirect:cursos";
    }
    
}
