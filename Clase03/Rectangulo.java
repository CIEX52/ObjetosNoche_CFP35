public class Rectangulo {
    double lado1;
    double lado2;

    Rectangulo(double lado1, double lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }

    double getPerimetro(){
        return (lado1+lado2)*2;
    }

    double getSuperficie(){
        return lado1*lado2;
    }

}
