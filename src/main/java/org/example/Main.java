package org.example;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        GestorBinario.hacerCopiaSeguridad(GestorBinario.leerFichero("teno.csv"));
        AnalisisDatos.minPorcentajeGente();
    }
}