package ar.org.centro35.curso.java.clase04.utils;

import ar.org.centro35.curso.java.clase04.interfaces.I_File;

public class FileBinary implements I_File {

    @Override
    public String getText() {
        return "Texto de archivo Binario!";
    }

    @Override
    public void setText(String text) {
        System.out.println("Escribiendo Archivo Binario!");
    }
    
}
