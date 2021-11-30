/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q17;

/**
 *
 * @author Shakila
 */
import java.util.Scanner;
public class Q17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println(" Enter a number ");
        n = input.nextInt();
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        if(sum%9==0){
            System.out.println(" The number is the multiply of 9");
        }else{
            System.out.println(" The number is n't the multiply of 9 ");
        }
    }
    
}
