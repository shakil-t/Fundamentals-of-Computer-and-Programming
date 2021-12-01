/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7;

/**
 *
 * @author shakil
 */
import java.util.Scanner;
public class T7 {

    /**
     * @param args the command line arguments
     */
    public static void multiplication(int n){
        for(int i=1;i<11;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int a;
        System.out.println("Enter the number");
        a=input.nextInt();
        multiplication(a);
    }
    
}
