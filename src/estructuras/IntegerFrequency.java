
package estructuras;
import java.io.IOException;
import java.util.*;

public class IntegerFrequency extends ValueFrequency<Integer> {
    
        int min;  
        int max;          
        int[] frecuencia;
    
    public IntegerFrequency(int min, int max) {   
        
        this.max = max;
        this.min = min;
        this.frecuencia = new int [max- min + 1];        
    }
    
    @Override
    public void increase(Integer value) {
        if(min <= value && value <= max){ // O(1) t1
            frecuencia[value - min] += 1; //O(1) t2
        }else{
            System.out.println("Valor fuera de rango \n"); //O(1) t3
        }
    }
    //La complejidad de éste método es de O(3)
    //El tiempo de ejecución del método es T(t1 + t2 + t3)
    
    @Override
    public void decrease(Integer value) {
        
        if(min <= value && value <= max){ // O(1) t1
            frecuencia[value - min] -= 1; // O(1) t2
        }else{
            System.out.println("Valor fuera de rango \n"); // O(1) t3
        }
    }
    //La complejidad de éste método es de O(3)
    //El tiempo de ejecución del método es T(t1 + t2 + t3)
    

    @Override
    public int getFrequency(Integer value) {
        try{ // O(1) t1
        if(min <= value && value <= max) // O(1) t2
        System.out.println(frecuencia[value- min]); // O(1) t3
        
        return frecuencia[value- min]; // O(1) t4
        }catch(java.lang.ArrayIndexOutOfBoundsException e){ // O(1) t5
            System.out.println("Valor fuera de rango \n"); // O(1) t6
        }
        return 0; // O(1) t7
    }
    //La complejidad de este método es de O(7)
    //El tiempo de ejecución dle método es T(t1+ t2+ t3+ t4+ t5+ t6+ t7)
    
    
}