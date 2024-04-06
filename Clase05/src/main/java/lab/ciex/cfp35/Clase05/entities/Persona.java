package lab.ciex.cfp35.Clase05.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public abstract class Persona {

    private String nombre;
    private int edad;
    private Direccion direccion;


    // public void Saludar(){
    //     System.out.println("Hola, soy " + this.nombre + " y tengo " + this.edad + " años" + " mi direccion es" + this.direccion);
    // }

    public abstract void Saludar();

}


