package ar.org.centro35.curso.java.clase04.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Direccion {

    private String calle;
    private int numero;
    private String piso;
    private String depto;
    private String ciudad;

    /**
     * Constructor para direcciones de Ciudad Autonoma de Buenos Aires
     */
    public Direccion(String calle, int numero, String piso, String depto) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.depto = depto;
        this.ciudad = "CABA";
    }

    
}
