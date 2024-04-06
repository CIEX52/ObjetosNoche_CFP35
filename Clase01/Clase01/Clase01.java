/**
 * Clase principal del proyecto
 */
public class Clase01 {

    /**
     * punto de entrada del proyecto
     * @param args argumentos que ingresan por consola
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo!!");
        System.out.println("Versión de java: "+System.getProperty("java.version"));

        //extensiones de vscode
        //Extension Pack for Java Microsoft
        //Todo Tree Gruntfuggly
        //MySQL Weijan Chen
        //Live Server Ritwick Dey



        //java -version                 - versión de jvm
        //javac -version                - versión compilador java
        //java Clase01.java             - para ejecutar el programa
        //javadoc *.java -d docs        - arma la javadocs


        //linéa de comentarios
        /*bloque de comentarios */
        /** 
         * comentario javadoc 
         * Este comentario es visible desde fuera del programa.
         * Este comentario debe colocarse delante de la declaración de método o clase
         */
        //TODO tarea pendiente

        //Identificadores en java (nombres de variables, clases o métodos en java)
        // pueden tener letras, numeros o simbolo _ o $
        // no puede iniciar con un numero
        int nro1=2;
        //int 1nro=2;       //Error
        int _1nro=2;
        int $1nro=2;
        //int &1nro=2;
        
        //tipo de datos primitivos

        //Tipo de datos boolean         
        boolean bo=true;                    //1
        System.out.println(bo);
        bo=false;                           //0
        System.out.println(bo);

        /*
         * 1
         * --------
         */

        //Tipo de datos byte        -128 a 127
        byte by=-100;
        System.out.println(by);

        //Tipo de datos short       2 bytes     signed      -32768 a 32767
        short sh=4600;
        System.out.println(sh);

        //Tipo de datos int         4 bytes
        int in=2000000000;
        System.out.println(in);

        //Tipo de datos long        8 bytes
        long lo=3000000000L;
        System.out.println(lo);

        //Tipo de datos char        2 bytes unsigned        65536
        char ch=65;
        System.out.println(ch);
        ch+=32;                     //sumando 32
        System.out.println(ch);
        System.out.println((int)ch);
        ch='x';
        System.out.println(ch);
        System.out.println((int)ch);

        //Tipo de datos de punto flotante

        //Tipo de datos float   32 bits
        float fl=5.25f;
        System.out.println(fl);

        //Tipo de datos double  64 bits
        double dl=5.25;
        System.out.println(dl);

        fl=1;
        dl=1;
        System.out.println(fl/3);
        System.out.println(dl/3);

        fl=10;
        dl=10;
        System.out.println(fl/3);
        System.out.println(dl/3);

        fl=100;
        dl=100;
        System.out.println(fl/3);
        System.out.println(dl/3);

        fl=1000;
        dl=1000;
        System.out.println(fl/3);
        System.out.println(dl/3);

        System.out.println(Math.sqrt(2));

        //Clase String
        String st="HOLA";
        System.out.println(st);

        //TODO Programación estructurada
        

    }

}