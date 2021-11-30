/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q9;

/**
 *
 * @author Shakila
 */
import java.util.Scanner;
public class Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println(" Enter a number ");
        n = input.nextInt();
        for( int i=1;i<n;i++){
            int m=n%i;
            if(0==m){
                System.out.print(" " + i);
            }
        }
       System.out.print(" " + n); 
    }
    
}
