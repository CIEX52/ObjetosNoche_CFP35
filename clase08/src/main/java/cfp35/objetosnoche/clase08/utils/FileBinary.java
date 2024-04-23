package cfp35.objetosnoche.clase08.utils;

import cfp35.objetosnoche.clase08.interfaces.I_File;

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
