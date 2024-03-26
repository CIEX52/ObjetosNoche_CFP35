package lab.ciex.cfp35.Clase05.test;

import lab.ciex.cfp35.Clase05.entities.Circulo;

public class TestFigura {
    public static void main(String[] args) {

        System.out.println("-- circulo --");
        Circulo circulo1 = new Circulo(2);

        circulo1.getPerimetro();
        circulo1.getSuperficie();
        circulo1.getEstado();
    }
    
}
