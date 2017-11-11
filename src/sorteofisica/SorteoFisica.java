package sorteofisica;
import java.util.ArrayList;

/**
 *
 * @author steve
 */
public class SorteoFisica {
    
    public static void main(String[] args) {
        String lis[] = {"Steven","Sueanny","Fanny","Yomaira","Luis","Victor","Huang"};
        ArrayList<Integer> PosAleatorias = new ArrayList<>();
        ArrayList<Integer> Ejercicios = new ArrayList<>();
        Aleatorios obj = new Aleatorios();
        //cant es la cantidad de ejercicios
        int cant = 17, cantidad = 0;
        PosAleatorias = obj.PosAleatorio();
        Ejercicios = obj.Ejercicios(cant);
        obj.Ejercicios(cantidad, lis, Ejercicios, PosAleatorias);
        
        System.out.println(); 
    }
}