/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

/**
 *
 * @author Shakila
 */
import java.util.Scanner;
public class Q6 {

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
        System.out.println(" Enter the elements ");
        for(int i=0;i<s;i++){
            array[i] = input.nextDouble();
        }
        for(int j=0;j<s;j++){
            if(array[j]%3==0){
                System.out.println(array[j]);
            }
        }
    }
    
}
