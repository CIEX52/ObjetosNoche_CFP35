package ar.org.centro35.curso.java.clase04.interfaces;

public interface I_File {
    /*
     * Una Interface:
     * - no tiene atributos ni métodos constructores.
     * - solo puede tener métodos abstractos o atributos constantes o estaticos
     * - todos sus miembros son publicos.
     * - una clase puede implementar todas las interface que necesite.
     * 
     */

    /**
     * Método para escribir texto en un archivo.
     * @param text texto a escribir.
     */
    void setText(String text);

    /**
     * Método que devuelve el texto de un archivo.
     * @return texto del archivo.
     */
    String getText();

    //metodo default        jdk 8 o sup
    public default void info(){
        System.out.println("interface I_File");
    }
}
