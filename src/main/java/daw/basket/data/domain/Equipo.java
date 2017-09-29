package daw.basket.data.domain;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Equipo{


    @Id
    @GeneratedValue
    private Long id;
    @Column(unique=true)
    private String nombre;
    private String localidad;
    private LocalDate fechaCreacion;

 public Equipo(String nombre, String localidad, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.fechaCreacion = fechaCreacion;
    }

    public Equipo() {
    }

}
