/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author Shakila
 */
import java.util.Scanner;
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double n;
        System.out.println(" Enter the number ");
        n = input.nextDouble();
        double m;
        System.out.println("Enter the coefficient ");
        m = input.nextDouble();
        double p=n;
        int i;
        if(m>0){
            for(i=1;i<m;i++){
                n=n+p;
            }
            System.out.println(n);
        }else{
            m=m*(-1);
            for(i=1;i<m;i++){
                n=n+p;
            }
            System.out.println(-n);
        }
    }
    
}
