package ar.org.centro35.curso.java.clase04.test;

import ar.org.centro35.curso.java.clase04.entities.Cliente;
import ar.org.centro35.curso.java.clase04.entities.Cuenta;
import ar.org.centro35.curso.java.clase04.entities.Direccion;
import ar.org.centro35.curso.java.clase04.entities.Vendedor;

public class TestHerencia {
    public static void main(String[] args) {
        
        System.out.println("-- cuenta1 --");
        Cuenta cuenta1=new Cuenta(1, "arg$");
        cuenta1.depositar(340000);
        cuenta1.depositar(280000);
        cuenta1.debitar(65000);
        System.out.println(cuenta1);

        System.out.println("-- direccion1 --");
        Direccion direccion1=new Direccion("Lavalle", 648, "8", "a");
        System.out.println(direccion1);

        System.out.println("-- direccion2 --");
        Direccion direccion2=new Direccion("Belgrano", 49, null, null, "Morón");
        System.out.println(direccion2);

        //System.out.println("-- persona1 --");
        //Persona persona1=new Persona("Ana", 26, new Direccion("viel",120,null,null));
        //System.out.println(persona1);
        //persona1.saludar();

        System.out.println("-- vendedor1 --");
        Vendedor vendedor1=new Vendedor("Jose", 40, direccion2, 1, 985000);
        System.out.println(vendedor1);
        vendedor1.saludar();

        System.out.println("-- clietne1 --");
        Cliente cliente1=new Cliente("Ricardo", 50, direccion2, 1, cuenta1);
        cliente1.getCuenta().depositar(450000);
        System.out.println(cliente1);
        cliente1.saludar();


    }
}
