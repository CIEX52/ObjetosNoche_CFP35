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

}//end class
