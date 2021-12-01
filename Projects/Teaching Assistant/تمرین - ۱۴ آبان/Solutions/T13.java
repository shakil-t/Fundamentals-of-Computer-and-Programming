/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t13;

/**
 *
 * @author shakil
 */
import java.util.Scanner;
public class T13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=input.nextInt();
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
