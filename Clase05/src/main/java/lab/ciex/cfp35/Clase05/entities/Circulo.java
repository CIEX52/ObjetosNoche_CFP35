package lab.ciex.cfp35.Clase05.entities;


public class Circulo extends Figura{
    double radio;

    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public void getPerimetro(){
        System.out.println(Math.PI * Math.pow(radio, 2));
    }

    public void getSuperficie(){
        System.out.println(2 * Math.PI * radio); 
    }

    public void getEstado(){
        System.out.println(this.radio);
    }
}
