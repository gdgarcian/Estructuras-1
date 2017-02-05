
package estructuras;

/**
 * ADT Example with abstract class
 * 
 * Data Structure to handle and query frequencies.
 * The data structure must initialize the initial frequency of any value to zero.
 * 
 * @author eduarc
 * @param <T> type template
 */
public abstract class ValueFrequency<T> {
    
    /**
     * Increase the frequency for value in one. 
     * 
     * @param value to be increased
     */
    public abstract void increase(T value);
    
    /**
     * Decrease the frequency for a value in one. 
     * 
     * @param value to be decreased
     */
    public abstract void decrease(T value);
    
    /**
     * Return the frequency for the specified value passed by reference.
     * 
     * @param value to be checked
     * @return The current frequency of value
     */
    public abstract int getFrequency(T value);
    
    /*public static void main(String[] args) {
        int min = 3;
        int max = 3; 
        int[] frecuencia = new  int[max-min];
        if(min < 0){
            min = -min;
        }
    
    }
    */
}
    
    
    

