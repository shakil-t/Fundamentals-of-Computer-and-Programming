/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q20;

/**
 *
 * @author Shakil
 */
import java.util.Scanner;
public class Q20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int counter;
        System.out.println(" Enter a number ");
        counter = input.nextInt();
        int n1=1;
        int n2=1;
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
