/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author shakil
 */
import java.util.Scanner;
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This code prints the Fibonacci series up to nth element
        //1,2,...,n are indexes 
        Scanner input=new Scanner(System.in);
       System.out.println(" Enter a number ");
        int counter;
        counter = input.nextInt();
        int n1=1;
        int n2=2;
        int n3;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i<counter;i++){
        n3=n1+n2;
        System.out.println(n3);
        n1=n2;
        n2=n3;
    }
        
    }
    
}
