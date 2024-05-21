package ar.org.centro35.colegio.test;

import java.sql.ResultSet;

import ar.org.centro35.colegio.connectors.Connector;

public class TestConnector {
    public static void main(String[] args) {
        try (ResultSet rs=Connector
                                    .getConnection()
                                    .createStatement()
                                    .executeQuery("select * from cursos")){
            if(rs.next()){
                System.out.println("Se conecto a "+rs.getString("titulo"));
            }else{
                System.out.println("No se pudo conectar a la BD");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No se pudo conectar a la BD");
        }
    }
}
