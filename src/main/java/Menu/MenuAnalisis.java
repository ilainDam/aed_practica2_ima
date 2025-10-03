package Menu;

import org.example.AnalisisDatos;

import java.io.IOException;
import java.util.Scanner;

public class MenuAnalisis {
    public static void menuAnalisis() throws IOException {
        Scanner leer = new Scanner(System.in);
        System.out.println();
        System.out.println("--MENU GESTOR ALEATORIO--");
        System.out.println("1. Minimo porcentaje de gente");
        System.out.println("0. Salir");
        switch (leer.nextInt()){
            case 1 -> {
                AnalisisDatos.minPorcentajeGente();
            }
            case 0 ->{
                System.out.println("Adios");
            }
            default -> {
                System.out.println("Esa opcion no es correcta");
            }
        }
    }
}
