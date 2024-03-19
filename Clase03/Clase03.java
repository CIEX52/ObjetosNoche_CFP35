import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class Clase03 {
    public static void main(String[] args) {
        System.out.println("Clase 03!\n");

        System.out.println("-- auto3 --");
        Auto auto3 = new Auto("VW", "UP", "Blanco", 100);
        
        
        auto3.acelerar(10);

        System.out.println(auto3.marca+" "+auto3.modelo+" "+auto3.color);

        System.out.println(auto3.obtenerVelocidad()+"Km/h");
        System.out.println("Frenando...");
        auto3.frenar();

        // JOptionPane.showMessageDialog(null, "Velocidad: "+auto3.obtenerVelocidad()+"Km/h");
        JOptionPane.showMessageDialog(null, auto3);

        DecimalFormat df = new DecimalFormat("0.00");

        Rectangulo recta1 = new Rectangulo(100, 120);

        Triangulo tria1 = new Triangulo(100, 120);

        Circulo circ1 = new Circulo(3);

        System.out.println("-- Rectangulo1 --");
        System.out.println("Perimetro: "+df.format(recta1.getPerimetro()));
        System.out.println("Superficie: "+df.format(recta1.getSuperficie())+"\n");

        System.out.println("-- Triangulo1 --");
        System.out.println("Perimetro: "+df.format(tria1.getPerimetro()));
        System.out.println("Superficie: "+df.format(tria1.getSuperficie())+"\n");

        System.out.println("-- Circulo1 --");
        System.out.println("Perimetro: "+df.format(circ1.getPerimetro()));
        System.out.println("Superficie: "+df.format(circ1.getSuperficie())+"\n");
        
    }
}
