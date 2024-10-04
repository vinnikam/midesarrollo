package co.ucentral.parqueadero.servicios;

import co.ucentral.parqueadero.ParqueaderoApplication;
import co.ucentral.parqueadero.persistencia.entidades.Vehiculo;
import co.ucentral.parqueadero.persistencia.repositorios.VehiculoRepositorio;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class VehiculoServicio {
    private static final Logger log = LogManager.getLogger(VehiculoServicio.class);

    VehiculoRepositorio vehiculoRepositorio;

    public List<Vehiculo> obtenerTodos(){
        List<Vehiculo> listado = (List<Vehiculo>) vehiculoRepositorio.findAll();
        return listado;
    }

    public boolean borrar(Vehiculo vehiculo){
        try{
            vehiculoRepositorio.delete(vehiculo);
        }catch (Exception e){
            log.error(e.getMessage());
            return false;
        }
        return true;
    }

}
