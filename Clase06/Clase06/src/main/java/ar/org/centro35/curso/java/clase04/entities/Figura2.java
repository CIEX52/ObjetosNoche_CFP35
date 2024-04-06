package ar.org.centro35.curso.java.clase04.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Figura2 {
    private double base;
    private double altura;
    private String tipo;                //rectangulo, triangulo, circulo
    public double getPerimetro(){
        if(tipo.equals("rectangulo"))   return (base+altura)*2;
        if(tipo.equals("triangulo"))    return base+altura+Math.PI;
        if(tipo.equals("circulo"))      return Math.PI*base*2;
        return 0;
    }
    public double getSuperficie(){
        return 0;
    }
    public String getEstado(){
        return "";
    }
}
