package ar.org.centro35.colegio.test;

import ar.org.centro35.colegio.repositories.CursoRepository;

public class TestApiStreamClean {
    public static void main(String[] args) {
        //Repositorio de Base de datos
        CursoRepository cursoRepository=new CursoRepository();
        // cursoRepository.save(new Curso(0,"PHP","Ferrari Laura",Dia.LUNES,Turno.NOCHE));

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
        
    }
}
