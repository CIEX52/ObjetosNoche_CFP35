package lab.ciex.cfp35.Clase05.entities;

public class Triangulo {
    double base;
    double altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    double getPerimetro(){
        return base+altura+Math.hypot(base, altura);
    };

    double getSuperficie(){
        return (base*altura)/2;
    };
}
