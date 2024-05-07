package ar.org.centro35.colegio.test;

import ar.org.centro35.colegio.entities.Alumno;
import ar.org.centro35.colegio.entities.Curso;
import ar.org.centro35.colegio.enums.Dia;
import ar.org.centro35.colegio.enums.Turno;
import ar.org.centro35.colegio.repository.AlumnoRepository;
import ar.org.centro35.colegio.repository.CursoRepository;

public class TestRepository {

    public static void main(String[] args) {
        CursoRepository cursoRepository = new CursoRepository();
        AlumnoRepository alumnoRepository = new AlumnoRepository();

        System.out.println(" --- Método .save() ---");

        // Curso curso = new Curso(0, "HTML y Bootstrap", "Gomez", Dia.MARTES, Turno.TARDE);
        // cursoRepository.save(curso);
        // System.out.println(curso);
        // System.err.println();
        // System.err.println();

        // System.out.println(" -- Método .getById() ---");	
        // System.out.println(cursoRepository.getById(13));
        // System.err.println();
        // System.err.println();

        // System.out.println(" -- Método .remove() ---");	
        // cursoRepository.remove(cursoRepository.getById(23));
        // System.err.println();
        // System.err.println();

        // System.out.println(" -- Método .getLikeTitulo() ---");
        // cursoRepository.getLikeTitulo("HT").forEach(System.out::println);
        // System.err.println();
        // System.err.println();

        // System.out.println(" -- Método .getAll() ---");    
        // cursoRepository.getAll().forEach(System.out::println);
        // System.err.println();
        // System.err.println();

        Alumno alumno = new Alumno(0, "Ivan", "Carneiro", 35, 12);
        alumnoRepository.save(alumno);
    }

}