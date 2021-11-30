/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q18;

/**
 *
 * @author Shakila
 */
import java.util.Scanner;
public class Q18 {

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
        double max=array[0];
        for(int j=1;j<s;j++){
            if(array[j]>max){
                max=array[j];
            }
        }
        double min1=max,min2=max,min3=max;
        for(int k=0;k<s;k++){
            if(min1>array[k]){
                min3=min2;
                min2=min1;
                min1=array[k];
            }
        }
        System.out.println(min1);
        System.out.println(min2);
        System.out.println(min3);
    }
}
