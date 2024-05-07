package ar.org.centro35.colegio.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ar.org.centro35.colegio.connectors.Connector;
import ar.org.centro35.colegio.entities.Alumno;

public class AlumnoRepository {
    
    private Connection conn = Connector.getConnection();

    public void save(Alumno alumno){
        if(alumno==null) return;
        try (PreparedStatement ps= conn.prepareStatement(
            "INSERT INTO alumnos (id, nombre, apellido, edad, id_curso) values (?,?,?,?,?)",
            PreparedStatement.RETURN_GENERATED_KEYS)){
                ps.setInt(1, alumno.getId());
                ps.setString(2, alumno.getNombre());
                ps.setString(3, alumno.getApellido());
                ps.setInt(4, alumno.getEdad());
                ps.setInt(5, alumno.getId_curso());
                ps.execute();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) alumno.setId(rs.getInt(1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

