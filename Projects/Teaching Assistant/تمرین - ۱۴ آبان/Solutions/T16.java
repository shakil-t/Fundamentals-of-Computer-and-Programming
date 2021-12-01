/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t16;

/**
 *
 * @author shakil
 */
import java.util.Scanner;
public class T16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=input.nextInt();
        while(n>0){
            System.out.print(n%10+" ");
            n=n/10;
        }
        
    }
    
}
