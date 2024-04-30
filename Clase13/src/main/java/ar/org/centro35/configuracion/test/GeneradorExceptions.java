package ar.org.centro35.configuracion.test;

public class GeneradorExceptions {
    public static void generar(){
        int[] vector=new int[5];
        vector[10]=20;
    }

    public static void generar(boolean x){
        if(x) System.out.println(10/0);
    }

    public static void generar(String nro){         //"26x"
        int n=Integer.parseInt(nro);
    }

    public static void generar(String text, int index){     //"hola",20
        //if(text == null || text.length()<=index || index<0) return;
        System.out.println(text.charAt(index));
    }
}
