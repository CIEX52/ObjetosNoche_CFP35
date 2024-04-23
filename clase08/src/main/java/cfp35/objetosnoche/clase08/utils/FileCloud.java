package cfp35.objetosnoche.clase08.utils;

import cfp35.objetosnoche.clase08.interfaces.I_File;


public class FileCloud implements I_File{

    @Override
    public String getText() {
        return "Texto de archivo de Nube!";
    }

    @Override
    public void setText(String text) {
        System.out.println("Escribiendo archivo de Nube!");
    }
    
}
