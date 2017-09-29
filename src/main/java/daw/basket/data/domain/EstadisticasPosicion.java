package daw.basket.data.domain;

import lombok.Data;

@Data

public class EstadisticasPosicion {
    private String posicion;
    private Double numCanastas;
    private Double numRebotes;
    private Double numAsistencias;

    public EstadisticasPosicion() {
    }

    public EstadisticasPosicion(String posicion, Double numCanastas, Double numRebotes, Double numAsistencias) {
        this.posicion = posicion;
        this.numCanastas = numCanastas;
        this.numRebotes = numRebotes;
        this.numAsistencias = numAsistencias;
    }

}
