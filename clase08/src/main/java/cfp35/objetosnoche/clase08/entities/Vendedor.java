package cfp35.objetosnoche.clase08.entities;

public class Vendedor extends Persona {
    
    private int nroLegajo;
    private double sueldoBasico;
    
    public Vendedor(String nombre, int edad, Direccion direccion, int nroLegajo, double sueldoBasico) {
        super(nombre, edad, direccion);
        this.nroLegajo = nroLegajo;
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public String toString() {
        return super.toString()+" Vendedor [nroLegajo=" + nroLegajo + ", sueldoBasico=" + sueldoBasico + "]";
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy un vendedor!");
    }
  
}
