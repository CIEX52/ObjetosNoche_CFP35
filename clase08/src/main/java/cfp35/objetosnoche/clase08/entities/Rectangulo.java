package cfp35.objetosnoche.clase08.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    @Override
    public String getEstado() {
        return this.toString();
    }
    @Override
    public double getPerimetro() {
        return (base+altura)*2;
    }
    @Override
    public double getSuperficie() {
        return base*altura;
    }
    
}
