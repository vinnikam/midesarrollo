package co.ucentral.parqueadero.servicios;

import co.ucentral.parqueadero.persistencia.entidades.Vehiculo;
import co.ucentral.parqueadero.persistencia.repositorios.VehiculoRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class VehiculoServicio {

    VehiculoRepositorio vehiculoRepositorio;

    public List<Vehiculo> obtenerTodos(){
        List<Vehiculo> listado = (List<Vehiculo>) vehiculoRepositorio.findAll();
        return listado;
    }

    public boolean borrar(Vehiculo vehiculo){
        try{
            vehiculoRepositorio.delete(vehiculo);
        }catch (Exception e){
            return false;
        }
        return true;
    }

}
