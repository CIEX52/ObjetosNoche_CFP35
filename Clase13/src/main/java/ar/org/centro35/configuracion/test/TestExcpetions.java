package ar.org.centro35.configuracion.test;

// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.io.IOException;

import ar.org.centro35.configuracion.entities.Vuelo;
import ar.org.centro35.configuracion.exceptions.NoHayPasajesExceptions;

public class TestExcpetions {
    public static void main(String[] args) {

        // try (FileWriter fw = new FileWriter("data/texto.txt")) { // Obligatorio
        // fw.write("Esto es una prueb");
        // fw.write(97);
        // }catch (FileNotFoundException e) {System.out.println("Archivo no
        // encontrado.");
        // }catch (IOException e) {System.out.println("Problema de I/O");
        // }catch (Exception e) {System.out.println("Ocurrió un error no esperado.");}

        // TEST VUELO
        // Vuelo vuelo1 = new Vuelo("AER1233", 100);
        // Vuelo vuelo2 = new Vuelo("LAT1188", 100);

        // try {
        //     vuelo1.vender(50);
        //     vuelo2.vender(20);
        //     vuelo1.vender(40);
        //     vuelo2.vender(10);
        //     vuelo1.vender(30);
        //     vuelo2.vender(10);
        // } catch (NoHayPasajesExceptions e) {
        //     System.out.println(e);
        // }

        try {
            GeneradorExceptions.generar();    
            //GeneradorException.generar(true);
            //GeneradorException.generar("26x");
            //GeneradorException.generar(null,30);
            //GeneradorException.generar("hola",30);
            //FileReader in=new FileReader("texto.txt");
        }catch(ArrayIndexOutOfBoundsException e){       System.out.println("Indice fuera de rango!");
        }catch(ArithmeticException e){                  System.out.println("Error división /0");
        }catch(NumberFormatException e){                System.out.println("Formato incorrecto!");
        }catch(NullPointerException e){                 System.out.println("Puntero Nulo!");
        }catch(StringIndexOutOfBoundsException e){      System.out.println("Indice fuera de rango!");
        //}catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) { 
        //  System.out.println("Indice fuera de rango!");
        //}catch(FileNotFoundException e){ System.out.println("Archivo no encontrado!");
        //}catch(IOException e){ System.out.println("Problemas de IO");
        //}catch(IndexOutOfBoundsException e){ System.out.println("Indice fuera de rango!"); 
        }catch(Exception e) {                           System.out.println("Ocurrio un error no esperado!");
        }
    }
}
