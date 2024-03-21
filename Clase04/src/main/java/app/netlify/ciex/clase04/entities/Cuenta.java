package app.netlify.ciex.clase04.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class Cuenta {
    private int nro;
    private String moneda;
    private double saldo;

    public Cuenta(int nro, String moneda) {
        this.nro = nro;
        this.moneda = moneda;
    }

    public void depositar(double monto) {
        if (monto>0) this.saldo+= monto;
        System.out.println("Ha depositado: " +moneda+monto);
        System.out.println("Saldo actual: "+moneda+saldo+"\n");
        System.out.println("----------------------------------------");
    }

    public synchronized void debitar(double monto, String moneda) {
        if (saldo>0 && saldo>= monto){
            this.saldo-=monto;
            System.out.println("Se ha debitado: " +moneda+saldo);
            System.out.println("Saldo actual: "+saldo+"\n");
            System.out.println("----------------------------------------");
        }
        else{
            System.out.println("Saldo insufficiente!!!");
            System.out.println("Saldo actual: "+moneda+saldo+"\n");
            System.out.println("----------------------------------------");
        }
    }

}
