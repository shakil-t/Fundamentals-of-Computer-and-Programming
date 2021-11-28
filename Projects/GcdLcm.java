/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcdlcm;

/**
 *
 * @author shakil
 */
import java.util.Scanner;
public class GcdLcm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter the first number ");
        int n;
        n = input.nextInt();
        System.out.println(" Enter the second number ");
        int m;
        m = input.nextInt();
        int s=m*n;
        while(m != n){
            if(n>m){
             n=n-m;
            }else{
            m=m-n;
            }
        }
        System.out.println(" GCD = "+ n);
        System.out.println(" LCM = "+ s/n);
    }
    
}
