/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q12;

/**
 *
 * @author Shakila
 */
import java.util.Scanner;
public class Q12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println(" Enter a decimal number ");
        n = input.nextInt();
        int[] array=new int[n];
        int m=0;
        while(n>0){
            array[m++]=n%2;
            n=n/2;
        }
        for(int i=m-1;i>=0;i--){
            System.out.print(array[i]);
        }
        
    }
    
}
