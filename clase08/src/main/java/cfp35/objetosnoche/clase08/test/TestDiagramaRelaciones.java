package cfp35.objetosnoche.clase08.test;

import java.util.ArrayList;

import cfp35.objetosnoche.clase08.entities.ClienteEmpresa;
import cfp35.objetosnoche.clase08.entities.ClientePersona;
import cfp35.objetosnoche.clase08.entities.Cuenta;



public class TestDiagramaRelaciones {
    public static void main(String[] args) {

        System.out.println("-- cuenta1 --");
        Cuenta cuenta1=new Cuenta(1, "arg$");
        cuenta1.depositar(340000);
        cuenta1.depositar(280000);
        cuenta1.debitar(65000);
        System.out.println(cuenta1);

        System.out.println("-- clientePersona1 --");
        ClientePersona clientePersona1=new ClientePersona(
                                        1, 
                                        "Juan Perez", 
                                        26,
                                        2,
                                        "arg$");
        clientePersona1.getCuenta().depositar(560000);
        clientePersona1.getCuenta().depositar(600000);
        clientePersona1.getCuenta().debitar(286000);
        System.out.println(clientePersona1);

        System.out.println("-- clienteConyuge1 --");
        ClientePersona clienteConyuge1=new ClientePersona(
                            2,
                            "Ana Gomez",
                            34,
                            new Cuenta(3,"arg$"));
        clienteConyuge1.getCuenta().depositar(500000);
        System.out.println(clienteConyuge1);

        System.out.println("-- clienteConyuge2 --");
        ClientePersona clienteConyuge2=new ClientePersona(
                        3, 
                        "Victor Jara", 
                        34,
                        clienteConyuge1.getCuenta());
        clienteConyuge2.getCuenta().debitar(400000);
        System.out.println(clienteConyuge2);
        System.out.println(clienteConyuge1);

        System.out.println("-- clienteEmpresa1 --");
        ClienteEmpresa clienteEmpresa1=new ClienteEmpresa(
                1, 
                "Taller", 
                "Balcarce 41");
        clienteEmpresa1.getCuentas().add(cuenta1);                  //0
        ArrayList<Cuenta> cuentas=clienteEmpresa1.getCuentas();
        cuentas.add(new Cuenta(11,"arg$"));             //1
        cuentas.add(new Cuenta(12, "Reales"));          //2
        cuentas.add(new Cuenta(13, "U$S"));             //3
        cuentas.get(1).depositar(1000000);
        cuentas.get(1).depositar(2000000);
        cuentas.get(1).debitar(500000);
        cuentas.get(2).depositar(55000);
        cuentas.get(3).depositar(12000);
        System.out.println(clienteEmpresa1);
        //cuentas.remove(0);


    }
}
