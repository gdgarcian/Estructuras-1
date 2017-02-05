
package estructuras;

import java.util.Scanner;


public class Prueba {
    
    public static void menu(){
        
    }
    
    public static void ingresar(){
       Scanner m = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
         Scanner o = new Scanner(System.in);   
          Scanner p = new Scanner(System.in);
        int min = 0, max = 0, sel = 0, val = 0;
        System.out.println("Ingrese valor entero minimo ");
        min = m.nextInt();
        System.out.println("Ingrese valor entero maximo \n");
        max = n.nextInt();
        if(min > max){
            System.out.println("El intervalo es inválido \n");
            ingresar();
        }
        IntegerFrequency prueba = new IntegerFrequency(min, max); 
        System.out.println("El rango es desde "+ min + " hasta "+ max + "\n" );
        
        while(true){
            System.out.println("Seleccione una opcion: ");
            System.out.println("1) Añadir un punto a un valor");
            System.out.println("2) Quitar un punto a un valor");
            System.out.println("3) verificar el estado de puntos de un valor");
            System.out.println("4) Salir");
            sel = o.nextInt();            
            if(sel == 1){
                System.out.println("Elija un valor entero dentro del rango ");
                val = p.nextInt();
                prueba.increase(val);
            }else if(sel == 2){
                System.out.println("Elija un valor entero dentro del rango ");
                val = p.nextInt();
                prueba.decrease(val);
            }else if (sel == 3){
                System.out.println("Elija un valor entero dentro del rango ");
                val = p.nextInt();
                prueba.getFrequency(val);
            }else if(sel == 4){
                System.exit(0);
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        ingresar();
        
        
    }
}
