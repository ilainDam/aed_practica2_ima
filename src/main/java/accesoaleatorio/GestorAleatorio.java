package accesoaleatorio;

import com.sun.source.tree.TryTree;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class GestorAleatorio {

    public static boolean guardarLugar(LugarTenerife lt){
        boolean correcto;
        try {
            RandomAccessFile acceso = new RandomAccessFile("lugaresT.dat","rw");
            acceso.seek(acceso.length());
            acceso.writeUTF(lt.getLugarTenerife());
            acceso.writeInt(lt.getVisitantes());
            acceso.writeFloat(lt.getCapitalRecaudado());
            acceso.close();
            correcto = true;
        }catch (Exception e){
            correcto = false;
        }
        return correcto;
    }
    public static void verLugar(int posicion) throws IOException {
        RandomAccessFile acceso = new RandomAccessFile("lugaresT.dat","r");
        acceso.seek(posicion);
        System.out.println(acceso.readUTF());;
        System.out.println(acceso.readInt());
        System.out.println(acceso.readFloat());
        acceso.close();
    }
    public static ArrayList<Integer> verTodosLugares() throws IOException {
        ArrayList<Integer> lugares = new ArrayList<>();
        RandomAccessFile archivo = new RandomAccessFile("lugaresT.dat","r");
        for (int i = 0; i < archivo.length()-1; i++) {
            if (i%26==0){
                System.out.println("Posicion: "+i);
                lugares.add(i);
            }
        }
        return lugares;
    }
    public static boolean modificarLugar(int pos,LugarTenerife lt){
        try{
            RandomAccessFile acceso = new RandomAccessFile("lugaresT.dat","rw");
            acceso.seek(pos);
            acceso.writeUTF(lt.getLugarTenerife());
            acceso.writeInt(lt.getVisitantes());
            acceso.writeFloat(lt.getVisitantes());
        }catch (Exception e){

        }
        return true;
    }

}
