package cfp35.objetosnoche.clase08.test;

import cfp35.objetosnoche.clase08.entities.Circulo;
import cfp35.objetosnoche.clase08.entities.Rectangulo;
import cfp35.objetosnoche.clase08.entities.Triangulo;

public class TestFiguras {
    public static void main(String[] args) {

        System.out.println("-- rectangulo1 --");
        Rectangulo rectangulo1=new Rectangulo(100, 120);
        System.out.println("Perimetro: "+rectangulo1.getPerimetro());
        System.out.println("Superficie: "+rectangulo1.getSuperficie());
        System.out.println(rectangulo1.getEstado());

        System.out.println("-- triangulo1 --");
        Triangulo triangulo1=new Triangulo(100, 120);
        System.out.println("Perimetro: "+triangulo1.getPerimetro());
        System.out.println("Superficie: "+triangulo1.getSuperficie());
        System.out.println(triangulo1.getEstado());

        System.out.println("-- circulo1 --");
        Circulo circulo1=new Circulo(100);
        System.out.println("Perimetro: "+circulo1.getPerimetro());
        System.out.println("Superficie: "+circulo1.getSuperficie());
        System.out.println(circulo1.getEstado());

    }
}
