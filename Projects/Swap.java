/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;

/**
 *
 * @author shakil
 */
public class Swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=23;
        int b=75;
        //swapping by a third variable
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println();
        
        int c=6;
        int d=2;
        //swapping without third variable
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println();
        
        int e=19;
        int f=7;
        //swapping by logical operators
        e=e^f;
        f=e^f;
        e=e^f;
        System.out.println("e="+e);
        System.out.println("f="+f);
    }
    
}
