package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class AnalisisDatos {
    public static void minPorcentajeGente() throws IOException {
        FileInputStream fis = new FileInputStream("tenoCars.dat");
        ObjectInputStream leer = new ObjectInputStream(fis);
        int ocupacionMaxima=0;
        int ocupacionActual;
        try {
            while (true){
                InstanciaTeno teno = (InstanciaTeno) leer.readObject();
                if (teno.getNumeroCoches()!=0){
                    ocupacionActual = teno.getNumeroPersonas()/teno.getNumeroCoches();
                    if (ocupacionActual>ocupacionMaxima){
                        ocupacionMaxima=ocupacionActual;
                    }
                }
            }
        }catch (Exception e){
            System.out.println("La ocupacion maxima es "+ocupacionMaxima);
        }
    }
    public static boolean escribirMaxCochesDiario(ArrayList<InstanciaTeno> lista){


        
        return true;
    }

}
