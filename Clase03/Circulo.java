public class Circulo {
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    double getPerimetro(){
        return Math.PI * Math.pow(radio, 2);
    };

    double getSuperficie(){
        return 2 * Math.PI * radio; 
    };
}
