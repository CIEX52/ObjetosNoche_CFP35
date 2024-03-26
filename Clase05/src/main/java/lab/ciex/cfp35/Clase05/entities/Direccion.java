package lab.ciex.cfp35.Clase05.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Direccion {

    private String calle;
    private int nro;
    private String piso;
    private String depto;
    private String ciudad;


    public Direccion(String calle, int nro, String piso, String depto, String ciudad) {
        this.calle = calle;
        this.nro = nro;
        this.piso = piso;
        this.depto = depto;
        this.ciudad = ciudad;
    }

}
