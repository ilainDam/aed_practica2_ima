package org.example;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class InstanciaTeno implements Serializable {

    private String fecha;
    private int numeroPersonas;
    private int numeroCoches;
    LocalDate fechaFormateada;
    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    public InstanciaTeno(String fecha, int numeroCoches, int numeroPersonas) {
        this.fecha = fecha;
        this.numeroCoches = numeroCoches;
        this.numeroPersonas = numeroPersonas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    @Override
    public String toString() {
        return "InstanciaTeno{" +
                "fecha='" + fecha + '\'' +
                ", numeroCoches=" + numeroCoches +
                ", numeroPersonas=" + numeroPersonas +
                '}';
    }
}
