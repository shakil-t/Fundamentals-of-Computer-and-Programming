/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5;

/**
 *
 * @author Shakila
 */
import java.util.Scanner;
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int s;
        System.out.println(" Enter the number of the elements ");
        s = input.nextInt();
        double[] array=new double[s];
        double sum=0;
        System.out.println(" Enter the elements ");
        for(int i=0;i<s;i++){
            array[i] = input.nextDouble();
            sum=sum+array[i];
        } 
        double ave=sum/s;
        System.out.println(" The average is " + ave);
    }
    
}
