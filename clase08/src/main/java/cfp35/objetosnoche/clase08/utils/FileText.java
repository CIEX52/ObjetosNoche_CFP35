package cfp35.objetosnoche.clase08.utils;

import cfp35.objetosnoche.clase08.interfaces.I_File;


public class FileText implements I_File{

    @Override
    public String getText() {
        return "texto de Archivo de texto!";
    }

    @Override
    public void setText(String text) {
        System.out.println("Escribiendo archivo de texto");
    }
    
}
