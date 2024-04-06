package ar.org.centro35.curso.java.clase04.test;

import java.util.Scanner;

import ar.org.centro35.curso.java.clase04.interfaces.I_File;
import ar.org.centro35.curso.java.clase04.utils.FileBinary;
import ar.org.centro35.curso.java.clase04.utils.FileCloud;
import ar.org.centro35.curso.java.clase04.utils.FileText;

public class TestInterfaces {
    public static void main(String[] args) throws Exception {
        I_File file=null;

        //file=new FileText();
        //file=new FileBinary();
        //file=new FileCloud();

        System.out.print("Ingrese 'FileText' o 'FileBinary' o 'FileCloud': ");
        String in=new Scanner(System.in).nextLine();
        //if(in.equals("FileText"))       file=new FileText();
        //if(in.equals("FileBinary"))     file=new FileBinary();
        //if(in.equals("FileCloud"))      file=new FileCloud();

        file=(I_File)Class
                            .forName("ar.org.centro35.curso.java.clase04.utils."+in)
                            //.newInstance();     //deprecado
                            .getConstructor(null)
                            .newInstance(null);

        //app
        file.setText("Hola");
        System.out.println(file.getText());
        file.info();

    }
}
