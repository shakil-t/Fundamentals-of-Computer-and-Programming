/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t18;

/**
 *
 * @author shakil
 */
import java.util.Scanner;
public class T18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int num1;
        System.out.println("Enter the first number:");
        num1=input.nextInt();
        int num2;
        System.out.println("Enter the second number:");
        num2=input.nextInt();
        int num3;
        System.out.print("Enter the third number: ");
        num3=input.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println("The greatest:"+num1);
            }
        }
        if(num2>num1){
            if(num2>num3){
                System.out.println("The greatest:"+num2);
            }
        }
        if(num3>num1){
            if(num3>num2){
                System.out.println("The greatest:"+num3);
            }
        }
    }
    
}
