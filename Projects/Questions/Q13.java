/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q13;

/**
 *
 * @author Shakila
 */
import java.util.*;
public class Q13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println(" Enter a binary number ");
        n = input .nextInt();
        int sum=0;
        int power=0;
        while(true){
            if(n==0){
                break;
            }else{
           int m=n%10;
           sum+=m*Math.pow(2, power);
           n=n/10;
           power++;
        }
    }
        System.out.println(sum);
    
}
}
