package ar.org.centro35.colegio.test;

import java.util.Comparator;
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

        System.out.println("********************************************************************************");
        //select * from cursos where profesor like '%a' and dia='LUNES'; 
        //cursoRepository
        //                .getAll()
        //                .stream()
        //                .filter(curso->curso.getProfesor().toLowerCase().endsWith("a")
        //                            && curso.getDia()==Dia.LUNES)
        //                .forEach(System.out::println);   
        cursoRepository
                        .getAll()
                        .stream()
                        .filter(curso->curso.getProfesor().toLowerCase().endsWith("a"))
                        .filter(curso->curso.getDia()==Dia.LUNES)
                        .forEach(System.out::println);

        System.out.println("********************************************************************************");
        //select * from cursos where profesor like '%a' or dia='LUNES'; 
        cursoRepository
                        .getAll()
                        .stream()
                        .filter(curso->curso.getProfesor().toLowerCase().endsWith("a")
                                    || curso.getDia()==Dia.LUNES)
                        .forEach(System.out::println);

        System.out.println("********************************************************************************");
        //select * from cursos where id>=5;
        cursoRepository
                        .getAll()
                        .stream()
                        .filter(curso->curso.getId()>=5)
                        .forEach(System.out::println);

        System.out.println("********************************************************************************");
        //select * from cursos where id  between 5 and 10;
        cursoRepository
                        .getAll()
                        .stream()
                        .filter(curso->curso.getId()>=5)
                        .filter(curso->curso.getId()<=10)
                        .forEach(System.out::println);
        
        System.out.println("********************************************************************************");
        //select * from cursos where id not between 5 and 10;
        cursoRepository
                        .getAll()
                        .stream()
                        .filter(curso->curso.getId()<5
                                    || curso.getId()>10)
                        .forEach(System.out::println);

        System.out.println("********************************************************************************");
        //select * from cursos order by titulo;
        cursoRepository
                        .getAll()
                        .stream()
                        .sorted(Comparator.comparing(Curso::getTitulo))
                        .forEach(System.out::println);
        
            System.out.println("********************************************************************************");
            //select * from cursos order by titulo desc, profesor;
            cursoRepository
                            .getAll()
                            .stream()
                            .sorted(Comparator
                                                .comparing(Curso::getTitulo)
                                                .reversed()
                                                .thenComparing(Curso::getProfesor))
                            .forEach(System.out::println);

            System.out.println("********************************************************************************");
            //select * from cursos where dia='LUNES' order by profesor;
            cursoRepository
                            .getAll()
                            .stream()
                            .filter(curso->curso.getDia()==Dia.LUNES)
                            .sorted(Comparator.comparing(Curso::getProfesor))
                            .forEach(System.out::println);

            System.out.println("********************************************************************************");
            //select min(titulo) from cursos;
            String titulo=cursoRepository
                            .getAll()
                            .stream()
                            .min(Comparator.comparing(Curso::getTitulo))
                            .get()
                            .getTitulo();
            System.out.println(titulo);

            System.out.println("********************************************************************************");
            //select max(id) from cursos;
            int id=cursoRepository
                            .getAll()
                            .stream()
                            .max(Comparator.comparingInt(Curso::getId))
                            .get()
                            .getId();
            System.out.println(id);

            System.out.println("********************************************************************************");
            //select * from cursos where id=(select max(id) from cursos);
            cursoRepository
                            .getAll()
                            .stream()
                            .filter(curso->curso.getId()==id)
                            .forEach(System.out::println);

    }
}
