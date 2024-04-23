public class Auto{
    String marca;
    String modelo;
    String color;
    int velocidad;

    Auto(String marca, String modelo, String color){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
    }

    void acelerar(){
        acelerar(10);
    }
    void acelerar(int kilometros){
        velocidad+=kilometros;
        if(velocidad>100) velocidad=100;
    }
    void frenar(){
        velocidad-=10;
    }

    //void método sin valor de retorno
    void imprimirVelocidad(){
        System.out.println(velocidad);
    }

    //int método con valor de retorno
    int obtenerVelocidad(){
        return velocidad;
    }

    @Override
    public String toString(){
        return marca+" "+modelo+" "+color+" "+velocidad;
    }

}