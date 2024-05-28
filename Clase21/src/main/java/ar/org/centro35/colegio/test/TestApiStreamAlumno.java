package ar.org.centro35.colegio.test;

import ar.org.centro35.colegio.entities.Alumno;
import ar.org.centro35.colegio.repositories.AlumnoRepository;

public class TestApiStreamAlumno {
    public static void main(String[] args) {
        AlumnoRepository alumnoRepository = new AlumnoRepository();

        System.out.println("-- Método save() --");
        // Alumno alumno = new Alumno(0,"Ivan","Carneiro",35,13);
        // Alumno alumno = new Alumno(0,"Tamara","Acosta",32,25);
        // alumnoRepository.save(alumno);
        System.out.println();

        System.out.println("-- Método getAll() --");
        // alumnoRepository.getAll().forEach(System.out::println);
        System.out.println();

        System.out.println("-- Método getLikeApellido() --");
        alumnoRepository.getLikeApellido("ac").forEach(System.out::println);
        System.out.println();

        System.out.println("-- Método getById() --");
        System.out.println(alumnoRepository.getById(32));
        System.out.println();

        System.out.println("-- Método remove() --");
        // alumnoRepository.remove(alumnoRepository.getById(34));
        System.out.println();
    }
}
