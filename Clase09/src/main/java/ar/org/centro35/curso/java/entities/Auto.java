package ar.org.centro35.curso.java.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
@EqualsAndHashCode
//@Data                   //@ToString @Getter @Setter @EqualsAndHashCode
public class Auto implements Comparable<Auto>{
    private String marca;
    private String modelo;
    private String color;

    @Override
    public int compareTo(Auto para) {
        String thisAuto=this.getMarca()+","+this.getModelo()+","+this.getColor();
        String paraAuto=para.getMarca()+","+para.getModelo()+","+para.getColor();
        return thisAuto.compareTo(paraAuto);
    }

    // @Override
    // public int hashCode() {
    //     return this.toString().hashCode();
    // }
    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) return true;
    //     return this.hashCode()==obj.hashCode();
    // }
 
    
}
