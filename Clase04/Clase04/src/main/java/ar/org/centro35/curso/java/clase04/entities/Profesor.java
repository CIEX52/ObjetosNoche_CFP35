package ar.org.centro35.curso.java.clase04.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@ToString
//@Getter
//@Setter
@Data
@AllArgsConstructor
public class Profesor {
    
    private int nro;
    private String nombre;
    private String apellido;
    private String materia;

}
