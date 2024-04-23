package cfp35.objetosnoche.clase08.test;

import cfp35.objetosnoche.clase08.entities.Profesor;

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
