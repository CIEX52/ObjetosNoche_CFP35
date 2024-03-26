package lab.ciex.cfp35.Clase05.entities;


public class Vendedor extends Persona {
    private int nroLegajo;
    private Double sueldoBasico;
    
    
    public Vendedor(String nombre, int edad, Direccion direccion, int nroLegajo, Double sueldoBasico) {
        super(nombre, edad, direccion);
        this.nroLegajo = nroLegajo;
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public void Saludar() {
        System.out.println("Hola, soy un vendedor!");
        
    }

    @Override
    public String toString() {
        return super.toString()+"Vendedor [nroLegajo=" + nroLegajo + ", sueldoBasico=" + sueldoBasico + "]";
    }

    
}