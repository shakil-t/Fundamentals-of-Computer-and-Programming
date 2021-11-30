/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author Shakil
 */
import java.util.Scanner;
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double n;
        System.out.println(" Enter the base number ");
        n = input.nextDouble();
        double m;
        System.out.println(" How many times do you want to use the number in a multplication?");
        m = input.nextDouble();
        double p=n;
        int i;
        if(m<0){
            m=m*(-1);
            for(i=1;i<m;i++){
                n=n*p;
            }
            System.out.println(1/n);
            }else{
        for(i=1;i<m;i++){
            n=n*p;
        }
        System.out.println(n);
    }  
}
}
