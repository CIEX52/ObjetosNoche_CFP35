import java.util.Date;

public class Clase02{
    public static void main(String[] args) {
        //Tipo de datos var jdk 10 o sup.
        var var1=2;                         //int
        var1=87;
        //var1="Hola";
        var var2=2L;                        //long
        var var3=true;                      //boolean
        var var4=2.25;                      //double
        var var5=2.25d;                     //double
        var var6=2.25f;                     //float
        var var7='x';                       //char
        var var8="x";                       //String
        var PI=Math.PI;                     //double
        
        funcion(var1);
        funcion(var2);
        funcion(var3);
        funcion(var4);
        funcion(var5);
        funcion(var6);
        funcion(var7);
        funcion(var8);
        funcion(PI);
        funcion(new Date().toString());

        //Programación estructurada
        String texto="Esto es una cadena de caracteres!";
        System.out.println(texto);

        //recorrido del vector texto
        for(int a=0; a<texto.length(); a++){
            char car=texto.charAt(a);
            System.out.print(car);
        }
        System.out.println();

        //imprimir texto en mayúsculas
        for(int a=0; a<texto.length(); a++){
            char car=texto.charAt(a);
            if(car>=97 && car<=122) car-=32;
            System.out.print(car);
        }
        System.out.println();

        //Operador ternario ?
        for(int a=0; a<texto.length(); a++){
            char car=texto.charAt(a);
            System.out.print((car>=97 && car<=122)?car-=32:car);
        }
        System.out.println();

        //Imprimir texto en minúculas
        for(int a=0; a<texto.length(); a++){
            char car=texto.charAt(a);
            System.out.print((car>=65 && car<=90)?car+=32:car);
        }
        System.out.println();

        System.out.println(texto);
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());


        /*
         * Paradigma de la Programación Orientada a Objetos
         * 
         * Clase: una clase representa cosas sustantivas y concretas
         *          de la realidad de un negocio. Las clases se 
         *          identifican en singular y la primer letra en 
         *          mayúsculas.
         * 
         * 
         * Atributos: son adjetivos que describen a la clase.
         *            son variables contenidas dentro de una clase
         *            y pertenecen a un tipo primitivo.
         * 
         * Métodos:   son acciones que realiza la clase, y se detectan
         *            como verbos.
         * 
         * Objetos: es una instancia en particular de la clase y tiene 
         *          estado propio(valor de atributos).
         * 
         * Los atributos String se inicializan en null
         * Los atributos numericos se inicializan en 0
         * 
         * Sobrecarga de método: ocurre cuando una clase tienen métodos
         *  con el mismo nombre, pero con distinta firma de parámetros
         *  de entrada.
         * 
         */

        System.out.println("-- auto1 --");
        Auto auto1 = new Auto();        //construye un auto
        auto1.marca="Ford";
        auto1.modelo="Mondeo";
        auto1.color="Rojo";
        auto1.acelerar();                   // 10
        auto1.acelerar();                   // 20
        auto1.acelerar();                   // 30
        auto1.frenar();                     // 20
        auto1.acelerar(16);      // 36
        

        System.out.println(auto1.marca+" "+auto1.modelo+" "+
                                auto1.color+" "+auto1.velocidad);
    
        System.out.println("-- auto2 --");
        Auto auto2 = new Auto();
        auto2.marca="Citroen";
        auto2.modelo="Berlingo";
        auto2.color="Bordo";
        
        for(int a=0; a<=60; a++) auto2.frenar(); //auto2.acelerar();
        //auto2.velocidad=885;
        System.out.println(auto2.marca+" "+auto2.modelo+" "+
        auto2.color+" "+auto2.velocidad);


        int x;
        //System.out.println(x);      //Error variable no inicializada     

        //TODO Sobrecarga de métodos

        //TODO Constructores

        //TODO Valor de retorno

        //TODO Método toString()

    }

    //Sobrecarga de métodos
    public static void funcion(int x){
        System.out.println("Parámetro entero");
    }
    public static void funcion(long x){
        System.out.println("Parámetro long");
    }
    public static void funcion(boolean x){
        System.out.println("Parámetro boolean");
    }
    public static void funcion(double x){
        System.out.println("Parámetro double");
    }
    public static void funcion(float x){
        System.out.println("Parámetro float");
    }
    public static void funcion(char x){
        System.out.println("Parámetro char");
    }
    public static void funcion(String x){
        System.out.println("Parámetro String");
    }

}