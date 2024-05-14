package ar.org.centro35.colegio.test;

import java.util.ArrayList;
import java.util.List;

import ar.org.centro35.colegio.entities.Curso;
import ar.org.centro35.colegio.enums.Dia;
import ar.org.centro35.colegio.enums.Turno;
import ar.org.centro35.colegio.repositories.CursoRepository;

public class TestApiStream {
    public static void main(String[] args) {
        //Repositorio de Base de datos
        CursoRepository cursoRepository=new CursoRepository();
        cursoRepository.save(new Curso(0,"PHP","Ferrari Laura",Dia.LUNES,Turno.NOCHE));

        //Repositorio Collection
        //ListRepository cursoRepository=new ListRepository();

        System.out.println("********************************************************************************");
        //select * from cursos
        cursoRepository.getAll().stream().forEach(System.out::println);

        System.out.println("********************************************************************************");
        //select * from cursos where profesor='Gomez';
        //for(Curso curso: cursoRepository.getAll()){
        //    if(curso.getProfesor().equals("Gomez")){
        //        System.out.println(curso);
        //    }
        //}
        
        
        cursoRepository
                        .getAll()
                        .stream()
                        .filter(curso->curso.getProfesor().equals("Gomez"))
                        .forEach(System.out::println);

        
        System.out.println("********************************************************************************");
        //select * from cursos where profesor like 'an%';
        cursoRepository
                        .getAll()
                        .stream()
                        .filter(curso->curso.getProfesor().toLowerCase().startsWith("an"))
                        .forEach(System.out::println);

        System.out.println("********************************************************************************");
        //select * from cursos where profesor like '%a';
        cursoRepository
                        .getAll()
                        .stream()
                        .filter(curso->curso.getProfesor().toLowerCase().endsWith("a"))
                        .forEach(System.out::println);

                        

    }
}
