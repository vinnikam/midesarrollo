package co.ucentral.parqueadero.controladores;

import co.ucentral.parqueadero.persistencia.entidades.Vehiculo;
import co.ucentral.parqueadero.servicios.VehiculoServicio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@AllArgsConstructor
@Controller
public class VehiculoControlador {
    VehiculoServicio vehiculoServicio;

    @GetMapping({"/vehiculos"})
    public String obtenerTodos(Model model){
        List<Vehiculo> listado =  vehiculoServicio.obtenerTodos();
        model.addAttribute("misvehiculos",listado);
        return "pagevehiculos";
    }
    public List<Vehiculo> obtenerTodos1(){
        return vehiculoServicio.obtenerTodos();

    }


}
