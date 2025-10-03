package Menu;

import accesoaleatorio.GestorAleatorio;
import accesoaleatorio.LugarTenerife;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuAleatorio {
    public static void menuAleatorio() throws IOException {
        int lugar;
        int opcion;
        Scanner leer = new Scanner(System.in);
        System.out.println();
        System.out.println("--MENU GESTOR ALEATORIO--");
        System.out.println("1. Guardar Lugar");
        System.out.println("2. Ver Lugar");
        System.out.println("3. Ver todos los lugares");
        System.out.println("4. Modificar lugar");
        System.out.println("0. Salir");
        opcion=leer.nextInt();
        leer.nextLine();
        switch (opcion){
            case 1 -> {
                System.out.println("Vas a guardar un lugar");
                if (GestorAleatorio.guardarLugar(leerLugar())){
                    System.out.println("Guardado el lugar correctamente");
                }else{
                    System.out.println("No se a guardado el lugar");
                };
            }
            case 2 -> {
                System.out.println("Los lugares disponibles son: ");
                ArrayList<Integer> lista = GestorAleatorio.verTodosLugares();
                lugar=leer.nextInt();
                leer.nextLine();
                if (comprobacionLugar(lugar,lista)){
                    GestorAleatorio.verLugar(lugar);
                }else {
                    System.out.println("No es un lugar correcto");
                }
            }
            case 3 -> {
                GestorAleatorio.verTodosLugares();
            }
            case 4-> {
                return;
            }
            case 0-> {
                System.out.println("Adios");
            }
            default -> {
                System.out.println("Haz escrito una opcion incorrecta");
            }
        }
    }
    public static LugarTenerife leerLugar(){
        String lugar;
        int visitantes;
        float capital;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el lugar");
        lugar=leer.nextLine();
        System.out.println("Dime la cantidad de visitantes");
        visitantes=leer.nextInt();
        leer.nextLine();
        System.out.println("Dime el capital recaudado");
        capital = leer.nextFloat();
        return new LugarTenerife(lugar,visitantes,capital);
    }
    public static boolean comprobacionLugar(int lugar,ArrayList<Integer> lista) {
        boolean esta=false;
        for (int i = 0; i < lista.size(); i++) {
            if (lugar==i){
                esta=true;
                break;
            }
        }
        return esta;
    }
}
