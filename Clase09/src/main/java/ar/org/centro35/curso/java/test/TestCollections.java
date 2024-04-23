package ar.org.centro35.curso.java.test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import ar.org.centro35.curso.java.entities.Auto;

public class TestCollections {
    public static void main(String[] args) {
        
        //Vector - Arreglo 
        Auto[] autos=new Auto[4];
        autos[0]=new Auto("Ford","Ka","Rojo");
        autos[1]=new Auto("Fiat","Idea","Verde");
        autos[2]=new Auto("Citroen","C4","Negro");
        autos[3]=new Auto("Renault","Clio","Verde");
        //autos[0]=new Auto("VW", "Fox", "Negro");

        //Recorrido con indices
        //for(int a=0; a<autos.length; a++){
        //    System.out.println(autos[a]);
        //}
        
        //Recorrido forEach jdk 5 o sup
        for(Auto auto : autos) System.out.println(auto);

        //Interface List <Generic>
        List<Auto>lista=new ArrayList();
        //List<Auto>lista=new LinkedList();
        //List<Auto>lista=new Vector();

        lista.add(new Auto("VW","Gol","Blanco"));           //0
        lista.add(new Auto("Citroen","Berlingo","Bordo"));  //1
        lista.add(new Auto("Peugeot","3008","Blanco"));     //2
        lista.add(new Auto("Renault","Kangoo","Negro"));    //3
        lista.add(2,new Auto("Fiat", "Toro", "Azul"));
        System.out.println("****************************************************");
        System.out.println(lista.get(2));
        //lista.remove(2);

        //copiar los autos del vector autos a lista
        for(Auto auto : autos) lista.add(auto);

        System.out.println("****************************************************");
        //Recorrido con indices
        //for(int a=0; a<lista.size(); a++){
        //    System.out.println(lista.get(a));
        //}

        //Recorrido foreach
        //for(Auto auto: lista) System.out.println(auto);

        // .metodo foreach() jdk 8 o sup.
        //lista.forEach(auto->System.out.println(auto));
        //lista.forEach(auto->{
        //            System.out.println(auto);
        //            System.out.println("-");
        //});     

        lista.forEach(System.out::println);

        //Interface Set
        Set<String>setSemana=null;

        //Implementación HashSet: es la más veloz, no hay garantia del orden
        //                              de los elementos.
        //setSemana=new HashSet();

        //Implementación LinkedHashSet: almacena los elementos en una lista enlazada
        //                              por orden de ingreso.
        //setSemana=new LinkedHashSet();

        //Implementación TreeSet:   almacena elementos en un arbol balanceado
        //                              por orden natural(alfabeticamente de menor a mayor)
        setSemana=new TreeSet();

        //app
        setSemana.add("Lunes");
        setSemana.add("Martes");
        setSemana.add("Miércoles");
        setSemana.add("Jueves");
        setSemana.add("Viernes");
        setSemana.add("Sábado");
        setSemana.add("Domingo");
        setSemana.add("Lunes");
        setSemana.add("Lunes");
        setSemana.add("Martes");
        setSemana.forEach(System.out::println);
        
        //Set<Auto>setAutos=new LinkedHashSet();
        //Set<Auto>setAutos=new HashSet();
        Set<Auto>setAutos=new TreeSet();
        setAutos.add(new Auto("Fiat","Toro","Verde"));
        setAutos.add(new Auto("VW", "Gol", "Blanco"));
        setAutos.add(new Auto("VW", "Gol", "Blanco"));
        setAutos.add(new Auto("VW", "Gol", "Blanco"));
        setAutos.addAll(lista);
        //setAutos.forEach(System.out::println);
        setAutos.forEach(auto->System.out.println(auto+" - "+auto.hashCode()));

        //FerraRi,Roja,Testarrosa
        //Ferra,Verde,Toto

        //Ana,Belen,012
        //Ana,Belen,009

        //Interface Map
        Map<String, String>mapaSemana=null;

        //Implementación HashMap: Es la más veloz pero no hay garantia del orden de los elementos
        //mapaSemana=new HashMap();

        //Implementación Hashtable: Es igual a HashMap. es obsoleta no se recomienda su uso.
        //mapaSemana=new Hashtable();

        //Implementación LinkedHashMap():   Almacena elementos en una lista enlazada por orden de ingreso
        //mapaSemana=new LinkedHashMap();

        //Implementación TreeMap:   Almacena elementos en un arbol, por orden natural del llave
        mapaSemana=new TreeMap();

        //app
        mapaSemana.put("lu", "Luna");
        mapaSemana.put("lu", "Lunes");
        mapaSemana.put("ma", "Martes");
        mapaSemana.put("mi", "Miércoles");
        mapaSemana.put("ju", "Jueves");
        mapaSemana.put("vi", "Viernes");
        mapaSemana.put("sa", "Sábado");
        mapaSemana.put("do", "Domingo");
        System.out.println(mapaSemana.get("ma"));           //Martes
        mapaSemana.forEach((k,v)->System.out.println(k+" : "+v));

        //Mapa de propiedades del sistema.
        System.out.println(System.getProperties());
        System.getProperties().forEach((k,v)->System.out.println(k+": "+v));

        System.out.println("Sistema operativo: "+
                                        System.getProperty("os.name")+" "+
                                        System.getProperty("os.version")+" "+
                                        System.getProperty("os.arch")
                                        );

        System.out.println("Java: "+
                                        System.getProperty("java.vm.name")+" "+
                                        System.getProperty("java.vm.version"));
                        
        System.out.println("User: "+    System.getProperty("user.name"));


        //Pila y Colas
        /*
         * Pila  Stack          LIFO    Last In First Out
         * 
         * Cola  ArrayDeque     FIFO    First In First Out
         * 
         */

         //Pila
        Stack<Auto>pilaAuto=new Stack();
        // Método .push() apila un elemento
        pilaAuto.push(new Auto("Citroen", "C4", "Negro"));
        pilaAuto.addAll(lista);
        pilaAuto.forEach(System.out::println); 
        
        System.out.println("Longitud de pila: "+pilaAuto.size());
        while(!pilaAuto.isEmpty()){
            // Método .pop() desapila un elemento
            System.out.println(pilaAuto.pop());
        }
        System.out.println("Longitud de pila: "+pilaAuto.size());

        //Cola
        ArrayDeque<Auto> colaAuto=new ArrayDeque();
        //Método .offer() encolar un elemento
        colaAuto.offer(new Auto("Fiat", "Idea", "Gris"));
        colaAuto.addAll(lista);
        colaAuto.forEach(System.out::println);
        System.out.println("Longitud de cola: "+colaAuto.size());
        while (!colaAuto.isEmpty()) {
            //Método .pop() desencola elementos
            System.out.println(colaAuto.pop());
        }
        System.out.println("Longitud de cola: "+colaAuto.size());

    }
}
