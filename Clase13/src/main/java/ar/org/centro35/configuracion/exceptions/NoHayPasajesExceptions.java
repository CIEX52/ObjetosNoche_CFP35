package ar.org.centro35.configuracion.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class NoHayPasajesExceptions extends Exception {
    private String nombreVuelo;
    private int cantPasajesDisponibles;
    private int cantPasajesPedidos;
    
    @Override
    public String getMessage() {
        return "El vuelo "+nombreVuelo+", no tiene "+cantPasajesPedidos+" pasajes, solo tiene "+cantPasajesDisponibles+" pasajes.";
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
