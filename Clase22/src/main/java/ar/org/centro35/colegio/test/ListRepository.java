package ar.org.centro35.colegio.test;

import java.util.ArrayList;
import java.util.List;

import ar.org.centro35.colegio.entities.Curso;
import ar.org.centro35.colegio.enums.Dia;
import ar.org.centro35.colegio.enums.Turno;

public class ListRepository {
    public List<Curso>getAll(){
        
        List<Curso>cursoRepository=new ArrayList();
        cursoRepository.add(new Curso(1, "Java", "Lorena", Dia.JUEVES, Turno.MAÑANA));
        cursoRepository.add(new Curso(2, "PHP", "Jose", Dia.LUNES, Turno.NOCHE));
        cursoRepository.add(new Curso(3, "Python", "Fernanda", Dia.VIERNES, Turno.TARDE));
        cursoRepository.add(new Curso(4, ".net", "Lautaro", Dia.JUEVES, Turno.NOCHE));
        cursoRepository.add(new Curso(5, "HTML", "Miguel", Dia.MARTES, Turno.MAÑANA));
        return cursoRepository;
    }
}
