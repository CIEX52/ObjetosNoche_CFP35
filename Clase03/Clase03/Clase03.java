import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Clase03 {
    public static void main(String[] args) {
        System.out.println("Clase 03!");

        System.out.println("-- auto3 --");
        Auto auto3=new Auto("VW", "UP", "Blanco");
        auto3.acelerar(25);
        auto3.velocidad=349;
        auto3.imprimirVelocidad();
        System.out.println(auto3.obtenerVelocidad());

        //System.out.println("Versión de java: "+System.getProperty("java.version"));
        //JOptionPane.showMessageDialog(null, "Hola a todos!");
        //JOptionPane.showMessageDialog(null, "Velocidad: "+auto3.obtenerVelocidad());

        //Método toString()
        System.out.println(auto3.toString());
        System.out.println(auto3);

        DecimalFormat df=new DecimalFormat("0.00");

        System.out.println("-- rectangulo1 --");
        Rectangulo rectangulo1=new Rectangulo(100, 120);
        System.out.println("Perímetro: "+df.format(rectangulo1.getPerimetro()));
        System.out.println("Superficie: "+df.format(rectangulo1.getSuperficie()));

        System.out.println("-- triangulo1 --");
        Triangulo triangulo1=new Triangulo(100, 120);
        System.out.println("Perímetro: "+df.format(triangulo1.getPerimetro()));
        System.out.println("Superficie: "+df.format(triangulo1.getSuperficie()));

        System.out.println("-- circulo1 --");
        Circulo circulo1 = new Circulo(100);
        System.out.println("Perímetro: "+df.format(circulo1.getPerimetro()));
        System.out.println("Superficie: "+df.format(circulo1.getSuperficie()));

        System.out.println("-- empleado1 --");
        Empleado empleado1=new Empleado(1, "Ana", "Godoy", 890000);
        //empleado1.sueldoBasico=9999999999L;
        empleado1.setSueldoBasico(9999999999L);
        System.out.println(empleado1);

        //TODO Modificadores de Visivilidad
        //TODO Encapsulamiento
        //TODO Springboot
        //TODO LomBOX



    }
}
