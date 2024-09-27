package co.ucentral.parqueadero.persistencia.repositorios;

import co.ucentral.parqueadero.persistencia.entidades.Vehiculo;
import org.springframework.data.repository.CrudRepository;

public interface VehiculoRepositorio extends CrudRepository<Vehiculo, Long> {
}
