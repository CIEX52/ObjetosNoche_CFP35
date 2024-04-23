package ar.org.centro35.curso.java.clase04.entities;

import java.util.ArrayList;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class ClienteEmpresa {
    private int nro;
    private String razonSocial;
    private String direccion;
    //private Cuenta[] cuentas=new Cuenta[4];
    private ArrayList<Cuenta> cuentas;

    public ClienteEmpresa(int nro, String razonSocial, String direccion) {
        this.nro = nro;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        cuentas = new ArrayList<>();
    }

    public void comprar(){
        System.out.println("ClienteEmpres realizo una compra!");
    }

    

}
