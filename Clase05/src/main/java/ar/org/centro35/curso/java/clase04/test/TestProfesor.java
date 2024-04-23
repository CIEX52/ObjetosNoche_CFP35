package ar.org.centro35.curso.java.clase04.test;

import ar.org.centro35.curso.java.clase04.entities.Profesor;

public class TestProfesor {
    public static void main(String[] args) {
        System.out.println("-- profesor1 --");
        Profesor profesor1=new Profesor(
                                            1, 
                                            "Carlos", 
                                            "Rios", 
                                            "Java"
                            );
        profesor1.setMateria("PHP");
        System.out.println(profesor1);

    }
}
