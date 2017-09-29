package daw.basket.data.domain;


import lombok.Data;

@Data

public class EstadisticasPosicionCompletas {


    private String posicion;

    private int maxCanastas;
    private int minCanastas;
    private double numCanastas;

    private int maxRebotes;
    private int minRebotes;
    private double numRebotes;

    private int maxAsistencias;
    private int minAsistencias;
    private double numAsistencias;


    public EstadisticasPosicionCompletas() {
    }

    public EstadisticasPosicionCompletas(String posicion, int maxCanastas, int minCanastas, double numCanastas, int maxRebotes, int minRebotes, double numRebotes, int maxAsistencias, int minAsistencias, double numAsistencias) {
        this.posicion = posicion;
        this.maxCanastas = maxCanastas;
        this.minCanastas = minCanastas;
        this.numCanastas = numCanastas;
        this.maxRebotes = maxRebotes;
        this.minRebotes = minRebotes;
        this.numRebotes = numRebotes;
        this.maxAsistencias = maxAsistencias;
        this.minAsistencias = minAsistencias;
        this.numAsistencias = numAsistencias;
    }

}
