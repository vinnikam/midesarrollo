package co.ucentral.parqueadero.controladores;

import co.ucentral.parqueadero.persistencia.entidades.Vehiculo;
import co.ucentral.parqueadero.servicios.VehiculoServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor
@Controller
public class VehiculoControlador {
    VehiculoServicio vehiculoServicio;

    public List<Vehiculo> obtenerTodos(){
        return vehiculoServicio.obtenerTodos();
    }
}
