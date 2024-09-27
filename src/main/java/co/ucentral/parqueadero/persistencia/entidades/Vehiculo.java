package co.ucentral.parqueadero.persistencia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "vehiculos")
@Entity
public class Vehiculo {
    @Id
    @Column(name = "veh_codigo")
    public long codigo;
    @Column(name = "veh_placa")
    public String placa;
    @Column(name = "veh_modelo")
    public int modelo;

}
