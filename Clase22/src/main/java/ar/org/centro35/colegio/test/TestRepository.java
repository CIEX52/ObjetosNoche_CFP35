package ar.org.centro35.colegio.test;

import ar.org.centro35.colegio.entities.Curso;
import ar.org.centro35.colegio.enums.Dia;
import ar.org.centro35.colegio.enums.Turno;
import ar.org.centro35.colegio.repositories.CursoRepository;

public class TestRepository {
    public static void main(String[] args) {
        CursoRepository cursoRepository=new CursoRepository();

        System.out.println("-- Método .save() --");
        Curso curso=new Curso(
                                0, 
                                "Java", 
                                "Gomez", 
                                Dia.MARTES, 
                                Turno.TARDE
        );
        cursoRepository.save(curso);
        System.out.println(curso);

        System.out.println("-- Método .getById() --");
        System.out.println(cursoRepository.getById(13));

        System.out.println(("-- Método .remove() --"));
        cursoRepository.remove(cursoRepository.getById(20));

        System.out.println("-- Método .getLikeTitulo() --");
        cursoRepository.getLikeTitulo("ja").forEach(System.out::println);

        System.out.println("-- Método .getAll() --");
        cursoRepository.getAll().forEach(System.out::println);

        //TODO API STREAM MARTES 14/05

    }
}
