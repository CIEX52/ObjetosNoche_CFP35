package ar.org.centro35.colegio.test;

import ar.org.centro35.colegio.entities.Alumno;
import ar.org.centro35.colegio.repositories.AlumnoRepository;

public class TestAlumnoRepository {
    public static void main(String[] args) {
        
        AlumnoRepository alumnoRepository=new AlumnoRepository();
        
        System.out.println("-- Método .save() --");
        Alumno alumno=new Alumno(0,"Mauro","Juarez",18,5);
        alumnoRepository.save(alumno);
        System.out.println(alumno);

        System.out.println("-- Método .getById() --");
        System.out.println(alumnoRepository.getById(5));

        System.out.println("-- Método .remove() --");
        alumnoRepository.remove(alumnoRepository.getById(25));

        System.out.println("-- Método .getLikeApellido() --");
        alumnoRepository.getLikeApellido("ju").forEach(System.out::println);

        System.out.println("-- Método .getAll() --");
        alumnoRepository.getAll().forEach(System.out::println);

    }
}
