/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max.min;

/**
 *
 * @author arshaddd43
 */

public class MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int array[] = new int[]{10,48,34,76,2,98,43,7,9,0};
    int max = getMax(array);
    System.out.println(" Max value is = "+ max);
    int min = getMin(array);
    System.out.println(" Min value is = "+ min);
    
    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 

    }
    
}