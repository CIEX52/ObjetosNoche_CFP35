package ar.org.centro35.curso.java.clase04.entities;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public final class Cuenta {
    
    private int nro;
    private String moneda;
    private double saldo;
    
    public Cuenta(int nro, String moneda){
        this.nro=nro;
        this.moneda=moneda;
    }
    
    public void depositar(double monto){
        if(monto>=0) this.saldo+=monto;
    }

    public synchronized void debitar(double monto){
        if(this.saldo>=monto && monto>0){
            this.saldo-=monto;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
