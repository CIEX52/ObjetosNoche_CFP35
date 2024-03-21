package app.netlify.ciex.clase04.test;

import app.netlify.ciex.clase04.entities.Alumno;

public class TestAlumno {
    public static void main(String[] args){
        System.out.println(" -- alumno1 -- ");
        Alumno alumno1 = new Alumno(1, "Ivan", "Carneiro", 8);

        System.out.println(alumno1);
    }
}
