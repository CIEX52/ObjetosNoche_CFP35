package cfp35.objetosnoche.clase08.entities;

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

    //public void saludar(){
    //    System.out.println("Hola soy una Persona!");
    //}

    public abstract void saludar();

}
