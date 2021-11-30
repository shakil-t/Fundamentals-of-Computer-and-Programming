/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

/**
 *
 * @author Shakil
 */
import java.util.Scanner;
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static double getMax(double[] array){
        double max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    public static double getMin(double[] array){
        double min=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int s;
        System.out.println(" Enter the number of the elements ");
        s = input.nextInt();
        double[] array=new double[s];
        System.out.println(" Enter the elements ");
        for(int i=0;i<s;i++){
            array[i] = input.nextDouble();
        }
        double max=getMax(array);
        System.out.println(" Max value is " + max);
        double min=getMin(array);
        System.out.println(" Min value is " + min);
        
    }
    
}
