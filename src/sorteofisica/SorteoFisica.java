package sorteofisica;
import java.util.ArrayList;

/**
 *
 * @author steve
 */
public class SorteoFisica {

    public static void main(String[] args) {
        String lis[] = {"Steven","Sueanny","Fanny","Yomaira","Luis","Victor","Huang"};
        Aleatorios obj = new Aleatorios();
        //cant es la cantidad de ejercicios
        int cant = 17, cantidad = 0;
        obj.PosAleatorio();
        obj.Ejercicios(cant);
        obj.Ejercicios(cantidad, lis);
        
        System.out.println("*******************");
	System.out.println();
	System.out.println("Este es un mensaje");

    }
    
}
