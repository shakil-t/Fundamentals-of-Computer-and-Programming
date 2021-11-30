/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q16;

/**
 *
 * @author Shakila
 */
import java.util.*;
public class Q16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println(" Enter a number ");
        n = input.nextInt();
        loop:
        for(int i=2;i<n;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    continue loop;
                }
            }
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    
}
