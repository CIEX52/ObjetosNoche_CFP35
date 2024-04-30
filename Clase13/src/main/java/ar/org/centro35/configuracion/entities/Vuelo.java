package ar.org.centro35.configuracion.entities;

import ar.org.centro35.configuracion.exceptions.NoHayPasajesExceptions;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vuelo {
    private String nombre;
    private int cantPasajesDisponibles;

    public synchronized void vender(int cantPasajesPedidos) throws NoHayPasajesExceptions {
        if (cantPasajesPedidos > cantPasajesDisponibles) {
            throw new NoHayPasajesExceptions(nombre, cantPasajesDisponibles, cantPasajesPedidos);
        }
        cantPasajesDisponibles -= cantPasajesPedidos;
    }
}
