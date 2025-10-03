package Menu;

import java.io.IOException;
import java.util.Scanner;

import static Menu.MenuAleatorio.menuAleatorio;
import static Menu.MenuAnalisis.menuAnalisis;
import static Menu.MenuBinario.menuBinario;

public class Menu {

    public static void menu() throws IOException {
        Scanner leer = new Scanner(System.in);
        System.out.println("*--MENU--*");
        System.out.println("1. Gestor binario");
        System.out.println("2. Analisis de datos ");
        System.out.println("3. Gestor aleatorio");
        System.out.println("0. Salir");
        switch (leer.nextInt()){
            case 1 -> {
                menuBinario();
            }
            case 2 -> {
                menuAnalisis();
            }
            case 3 -> {
                menuAleatorio();
            }
            case 0 -> {
                System.out.println("Adios");;
            }
            default -> {
                System.out.println("Esa opcion no es correcta");
            }
        }
    }
}
