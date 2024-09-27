package co.ucentral.parqueadero.persistencia.repositorios;

import co.ucentral.parqueadero.persistencia.entidades.Propietario;
import co.ucentral.parqueadero.persistencia.entidades.Vehiculo;
import org.springframework.data.repository.CrudRepository;

public interface PropietarioRepositorio extends CrudRepository<Propietario, String> {
}
