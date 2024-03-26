package ar.org.centro35.curso.java.clase04.entities;

public class Alumno {

    private int nro;
    private String nombre;
    private String apellido;
    private int nota;
    
    public Alumno(int nro, String nombre, String apellido, int nota) {
        this.nro = nro;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno [nro=" + nro + ", nombre=" + nombre + ", apellido=" + apellido + ", nota=" + nota + "]";
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}
