/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q14;

/**
 *
 * @author Shakila
 */
import java.util.Scanner;
public class Q14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        boolean increase=true;
        boolean decrease=true;
        int s;
        System.out.println(" Enter the number of the elements ");
        s = input.nextInt();
        double[] array=new double[s];
        System.out.println(" Enter the elements ");
        for(int i=0;i<s;i++){
            array[i] = input.nextDouble();
        }
        for(int j=0;j<s-1;j++){
            if(increase==true&&array[j]>array[j+1]){
                increase=false;
            }
            if(decrease==true&&array[j]<array[j+1]){
                decrease=false;
            }
        }
        if(increase==decrease){
            System.out.println(" Untidy ");
        }else{
            if(increase==true&&decrease==false){
                System.out.println(" Tidy ");
                System.out.println(" Increasing ");
            }else{
                System.out.println(" Tidy ");
                System.out.println(" Decreasing ");
            }
        }
    }
}