package Menu;

import org.example.GestorBinario;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MenuBinario {
    public static void menuBinario() throws FileNotFoundException {
        Scanner leer = new Scanner(System.in);
        System.out.println();
        System.out.println("--MENU GESTOR ALEATORIO--");
        System.out.println("1. Leer fichero");
        System.out.println("2. Hacer copia de seguridad");
        System.out.println("3. Salir");
        switch (leer.nextInt()){
            case 0->{
                System.out.println("Adios");
            }
            case 1-> {
                leer.nextLine();
                System.out.println("Dime el nombre del fichero");
                GestorBinario.leerFichero(leer.nextLine());
            }
            case 2->{
                leer.nextLine();
                System.out.println("Dime el nombre del fichero del que quieres hacer la copia de seguridad");
                if (GestorBinario.hacerCopiaSeguridad(GestorBinario.leerFichero(leer.nextLine()))){
                    System.out.println("Guardada la copia de seguridad correctamente");
                }else {
                    System.out.println("Ha habido un fallo con la copia de seguridad");
                }
            }
            default ->{
                System.out.println("No es una opcion correcta");
            }
        }
    }
}
