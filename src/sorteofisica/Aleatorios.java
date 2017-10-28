package sorteofisica;

import java.util.ArrayList;

/**
 *
 * @author steve
 */
public class Aleatorios {
    ArrayList<Integer> a = new ArrayList<Integer>();
    private int c;
    ArrayList<Integer> ejercicios = new ArrayList<>();
        
    public void PosAleatorio(){    
        for(int i=0;7>i;i++){
            c = (int) (Math.random()*7);
            while(a.indexOf(c)!=-1){c = (int) (Math.random()*7);}
            a.add(c);
        }
    }
    
    public void Ejercicios(int cant){
        //Cantidad de ejercicios
        int  ejer, sort = cant; 
        while (cant >0){
            //Cantidad de ejercicios a sortear
            ejer = (int)(Math.random()* sort+1);
            if(ejercicios.indexOf(ejer)==-1){
                ejercicios.add(ejer);
                cant--;
            }
        }
    }
 
    public void Ejercicios(int cantidad, String lis[]){
        int  pos = 0;
        System.out.println(ejercicios);
        for(Integer i:a){
            if (cantidad <3){
                System.out.print("\nA "+lis[i]+" le toca: "+ejercicios.get(pos));
                pos++;
                while (pos!=3 && pos!=6 && pos!=9){
                    System.out.print(", "+ejercicios.get(pos));
                    pos++;
                }
            }
            else{
                System.out.print("\nA "+lis[i]+" le toca: "+ejercicios.get(pos));
                pos++;
                while (pos!=11 && pos!=13 && pos!=15 && pos!=17){
                    System.out.print(", "+ejercicios.get(pos));
                    pos++;
                }
            }
            cantidad++;
        }
    }
}
