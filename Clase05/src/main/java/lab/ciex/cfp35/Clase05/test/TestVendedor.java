package lab.ciex.cfp35.Clase05.test;

import lab.ciex.cfp35.Clase05.entities.Direccion;
import lab.ciex.cfp35.Clase05.entities.Vendedor;


public class TestVendedor {

    public static void main(String[] args) {
        System.out.println(" -- vendedor1 -- ");
        Vendedor vendedor1 = new Vendedor("Ivan Carneiro", 35, new Direccion("Av. Montes de Oca", 969, "1", "G", "Barracas"), 1, 650000.);

        System.out.println(vendedor1);
    }
    
}
