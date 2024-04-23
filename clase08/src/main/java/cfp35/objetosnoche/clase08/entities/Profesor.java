package cfp35.objetosnoche.clase08.entities;

import lombok.AllArgsConstructor;
import lombok.Data;


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
