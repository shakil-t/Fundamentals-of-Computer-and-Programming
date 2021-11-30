/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q11;

/**
 *
 * @author Shakila
 */
import java.util.Scanner;
public class Q11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println(" Enter the first number ");
        n = input.nextInt();
        int m;
        System.out.println(" Enter the second number ");
        m = input.nextInt();
        int s=m*n;
        while(n!=m){
            if(n>m){
                n=n-m;
            }else{
                m=m-n;
            }
        }
        System.out.println(" GCD = " + n);
        System.out.println(" LCM = " + (s/n));
    }
    
}
