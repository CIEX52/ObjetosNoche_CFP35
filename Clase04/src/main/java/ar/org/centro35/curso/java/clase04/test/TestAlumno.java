package ar.org.centro35.curso.java.clase04.test;

import ar.org.centro35.curso.java.clase04.entities.Alumno;

public class TestAlumno {
    public static void main(String[] args) {
        System.out.println("-- alumno1 --");
        Alumno alumno1=new Alumno(
                    1, 
                    "Grabriela", 
                    "Guichon", 
                    5
        );
        //alumno1.nota=10;
        alumno1.setNota(10);
        System.out.println(alumno1);

    }
}