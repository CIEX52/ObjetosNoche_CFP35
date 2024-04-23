package ar.org.centro35.curso.java.clase04.entities;

import lombok.Getter;

@Getter
public class Cliente extends Persona{
    
    private int nroCliente;
    private Cuenta cuenta;

    public Cliente(String nombre, int edad, Direccion direccion, int nroCliente, Cuenta cuenta) {
        super(nombre, edad, direccion); //llama al constructor de la clase padre
        this.nroCliente = nroCliente;
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return super.toString()+" Cliente [nroCliente=" + nroCliente + ", cuenta=" + cuenta + "]";
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy un cliente!");
    }

}
