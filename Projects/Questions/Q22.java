/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q22;

/**
 *
 * @author Shakila
 */
import java.util.Scanner;
public class Q22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double[] array=new double[100];
        double sum=0;
        System.out.println(" Enter the numbers ");
        for(int i=0;i<100;i++){
           array[i] = input.nextDouble();
           sum+=array[i];
        }
        double m=sum/100;
        //M stands for Mean
        double squaredd=0;
        //Squaredd is the short form of Squared Distance 
        for(int i=0;i<100;i++){
            squaredd+=(array[i]-m)*(array[i]-m);
        }
        double v=squaredd/100;
        //V stands for Variance
        System.out.println(" Mean equals to " + m);
        System.out.println(" Deviation equals to " + Math.sqrt(v));
    }
    
}
