/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author Shakila
 */
import java.util.Scanner;
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println(" Enter the division ");
        n = input.nextInt();
        int m;
        System.out.println(" Enter the divisor ");
        m = input.nextInt();
        int q=0;
        if(m==0){
            System.out.println(" Invalid ");
        }else{
            if(n>0&&m>0){
            switch(n){
                case 0:
                    System.out.println(" The quotient equals to 0 ");
                    System.out.println(" The quotient equals to 0 ");
                    break;
                default :
                    while(n==m||n>m){
                        n=n-m;
                        q++;
                        }
                    System.out.println(" The quotient equals to " + q);
                    System.out.println(" The remainder equals to " + n);
                }
            }else{
                if(m<0&&n<0){
                    m=m*(-1);
                    n=n*(-1);
                    while(n>m||n==m){
                        n=n-m;
                        q++;
                    }
                    System.out.println(" The quotient equals to " + q);
                    System.out.println(" The remainder equals to " + -n);
                }else{
                if(m<0){
                    m=m*(-1);
                    while(n>m||n==m){
                        n=n-m;
                        q++;
                    }
                    System.out.println(" The quotient equals to " + -q);
                    System.out.println(" The remainder equals to " + n);
                }else{
                    n=n*(-1);
                    while(n==m||n>m){
                        n=n-m;
                        q++;
                    }
                    System.out.println(" The quotient equals to " + -q);
                    System.out.println(" The remainder equals to " + n);
                }
                }
            }
    
    
}
}
}
