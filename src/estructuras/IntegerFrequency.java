/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;
import java.io.IOException;
import java.util.*;
/**
 * Particular implementation for the ADT ValueFrequency
 * 
 * @author eduarc
 */
public class IntegerFrequency extends ValueFrequency<Integer> {

    // Value el número de arriba, Frecuencia el contador
        
        
        int min;  
        int max;  
        
        int[] frecuencia;
    
    //Este método guarda el arreglo de frecuencias
    public IntegerFrequency(int min, int max) {   
        
        this.max = max;
        this.min = min;
        this.frecuencia = new int [max- min + 1];
        
        /*for (int i = min; i < frecuencia.length; i++) {
           System.out.print(i + "  ");
        }*/
    }
    
    //Este método incrementa las frecuencias de acuerdo al 
    //valor que el usuario le asigne dentro del rango
    @Override
    public void increase(Integer value) {
        if(min <= value && value <= max){
            frecuencia[value - min] += 1;;
        }else{
            System.out.println("Valor fuera de rango");
        }
    }
    //Este método decrementa las frecuencias de acuerdo al 
    //valor que el usuario le asigne dentro del rango
    @Override
    public void decrease(Integer value) {
        
        if(min <= value && value <= max){
            frecuencia[value - min] -= 1;;
        }else{
            System.out.println("Valor fuera de rango");
        }
    }

    //Este método muestra las frecuencias
    @Override
    public int getFrequency(Integer value) {
        // Implementation goes here
        try{
        if(min <= value && value <= max)
        System.out.println(frecuencia[value- min]);
        
        return frecuencia[value- min];
        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Valor fuera de rango");
        }
        return 0;
    }
    
    
}