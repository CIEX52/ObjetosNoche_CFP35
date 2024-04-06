package ar.org.centro35.curso.java.clase04.entities;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class ClientePersona {
    private int nro;
    private String nombre;
    private int edad;
    private Cuenta cuenta;

    //Un cliente persona puede crearse sin una cuenta
    public ClientePersona(int nro, String nombre, int edad){
        this.nro=nro;
        this.nombre=nombre;
        this.edad=edad;
    }

    //Un clientePersona siempre tiene una cuenta
    //Una cuenta puede pertenecer a mas de una persona
    public ClientePersona(int nro, String nombre, int edad, Cuenta cuenta){
        this.nro=nro;
        this.nombre=nombre;
        this.edad=edad;
        this.cuenta=cuenta;
    }

    //Un clientePersona siempre tiene una cuenta
    //La cuenta solo pertenece a este cliente
    public ClientePersona(int nro, String nombre, int edad, int nroCuenta, String moneda){
        this.nro=nro;
        this.nombre=nombre;
        this.edad=edad;
        this.cuenta = new Cuenta(nroCuenta, moneda);
    }

    public void comprar(){
        System.out.println("Se realizo una compra!!");
    }

}
