package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorBinario {

    public static ArrayList<InstanciaTeno> leerFichero(String fichero) throws FileNotFoundException {
        ArrayList<InstanciaTeno> tenoRelleno = new ArrayList<>();
        Scanner leer = new Scanner(new File(fichero));
        String[] lineaSeparada;
        leer.nextLine();
        while (leer.hasNext()) {
            lineaSeparada = leer.nextLine().split(",");
            InstanciaTeno teno = new InstanciaTeno(lineaSeparada[0], Integer.parseInt(lineaSeparada[1]), Integer.parseInt(lineaSeparada[2]));
            tenoRelleno.add(teno);
        }
        return tenoRelleno;
    }

    public static boolean hacerCopiaSeguridad(ArrayList<InstanciaTeno> lista) {
        boolean termino = true;
        try {
            FileOutputStream fos = new FileOutputStream("tenoCars.dat");
            ObjectOutputStream escribir = new ObjectOutputStream(fos);
            for (InstanciaTeno teno : lista) {
                escribir.writeObject(teno);
            }
            fos.close();
            escribir.close();
        } catch (Exception e) {
            termino = false;
        }
        return termino;
    }
}
