package ar.org.centro35.curso.java.clase04.test;

import java.sql.Date;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Calendar;

import ar.org.centro35.curso.java.clase04.entities.Circulo;
import ar.org.centro35.curso.java.clase04.entities.Figura;
import ar.org.centro35.curso.java.clase04.entities.Rectangulo;
import ar.org.centro35.curso.java.clase04.entities.Triangulo;

public class TestPolimoprfismo {
    public static void main(String[] args) {
        //Polimorfismo - Poliformismo

        Figura figura1=null;

        //figura1=new Rectangulo(100,120);
        figura1=new Triangulo(100,120);
        //figura1=new Circulo(120);

        //app
        DecimalFormat df=new DecimalFormat("0.00");
        System.out.println("Perimetro: "+figura1.getPerimetro());
        System.out.println("Superficie: "+figura1.getSuperficie());
        System.out.println(figura1.getEstado());

        System.out.println(figura1.getClass());
        System.out.println(figura1.getClass().getName());
        System.out.println(figura1.getClass().getSimpleName());
        System.out.println(figura1.getClass().getSuperclass().getName());
        System.out.println(figura1
                                    .getClass()
                                    .getSuperclass()
                                    .getSuperclass()
                                    .getName());
                                
        System.out.println(figura1
                                    .getClass()
                                    .getSuperclass()
                                    .getSuperclass()
                                    .getSuperclass());

        String texto="Hola";
        System.out.println(texto.getClass().getName());
        System.out.println(texto.getClass().getSuperclass().getName());

        //Fecha Hora
        Date date=new Date(0);      //JDK 1.1
        System.out.println(date);

        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);   //JDK 1.1

        LocalDate ld=LocalDate.now();   //JDK 1.8
        System.out.println(ld);

        //operador instanceOf
        System.out.println(figura1 instanceof Rectangulo);
        System.out.println(figura1 instanceof Triangulo);
        System.out.println(figura1 instanceof Circulo);

        

    }
}
