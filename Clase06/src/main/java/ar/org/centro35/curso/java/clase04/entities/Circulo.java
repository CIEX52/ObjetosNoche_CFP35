package ar.org.centro35.curso.java.clase04.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Circulo extends Figura {
    private double radio;

    @Override
    public String getEstado() {
        return toString();
    }

    @Override
    public double getPerimetro() {
        return Math.PI*radio*2;
    }

    @Override
    public double getSuperficie() {
        return Math.PI*Math.pow(radio, 2);
    }

    
}
