package lab.ciex.cfp35.Clase05.entities;

public class Rectangulo {
    double lado1;
    double lado2;

    Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

   double getPerimetro(){
    return 2*(lado1+lado2);
   };

   double getSuperficie(){
    return lado1*lado2;
   };

}
