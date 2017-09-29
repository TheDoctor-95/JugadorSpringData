package daw.basket.data.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private LocalDate fechaNac;
    private Integer canastas;
    private Integer asistencias;
    private Integer rebotes;
    private String posicion;
    @ManyToOne
    private Equipo equipo;


    public Jugador(String nombre, LocalDate fecha_nac, Integer canastas, Integer asistencias, Integer rebotes, String posicion) {
        this.nombre = nombre;
        this.fechaNac = fecha_nac;
        this.canastas = canastas;
        this.asistencias = asistencias;
        this.rebotes = rebotes;
        this.posicion = posicion;
    }

    public Jugador(){
    }

}