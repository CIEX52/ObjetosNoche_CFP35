public class Circulo {
    double radio;
    
    Circulo(double radio){
        this.radio=radio;
    }

    double getPerimetro(){
        return Math.PI*radio*2;
    }

    double getSuperficie(){
        return Math.PI*radio*radio;
        //return Math.PI*Math.pow(radio, 2); 
    }
}
