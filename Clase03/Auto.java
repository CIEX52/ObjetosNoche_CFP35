/**
 * Esta clase representa automoviles.
 */
//declaración de clase
public class Auto {
    
    //Atributos
    String marca;
    String modelo;
    String color;
    int velocidad;

    Auto(String marca, String modelo, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    //Métodos
    /**
     * Este método incrementa la velocidad en 10 Kms/hora. 
     * La velocidad máxima es 100 Kms/hora.
     */
    void acelerar(){
        //velocidad+=10;      //HardCodeado
        //if(velocidad>=100)  velocidad=100;
        acelerar(10);           //llamado de método dentro de la misma clase
    }

    void acelerar(int kilometros){
        velocidad+=kilometros;
        if(velocidad>=100)  velocidad=100;
    }

    /**
     * Este método decrementa la velocidad en 10 Kms/hora. 
     * La velocidad mínima es -20 Kms/hora.
     */
    void frenar(){
        //método de frenado
        /* método de frenado */
        //#método de frenado
        velocidad-=10;
        if(velocidad<=-20) velocidad=-20;
    }

    void imprimirVelocidad(){
        System.out.println(velocidad);
    }

    int obtenerVelocidad(){
        return velocidad;
    }

    @Override
    public String toString(){
        return "Auto3\n______"
        +"\nMarca: "+ marca 
        + "\nModelo: " + modelo 
        + "\nColor: " + color 
        + "\nVelocidad: " + velocidad+"Km/h";
    }

}//end class
