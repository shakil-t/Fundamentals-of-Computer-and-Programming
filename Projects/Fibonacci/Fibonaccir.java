/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccir;

/**
 *
 * @author shakil
 */
import java.util.Scanner;
public class Fibonaccir {

    /**
     * @param args the command line arguments
     */

    static int n1 = 1, n2 = 1, n3 = 0;
    public static void fibonaccir(int counter) {
        if (counter > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            fibonaccir(counter - 1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This code prints the Fibonacci series up to nth element in a recurrsive manner
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int counter;
        counter = input.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        fibonaccir(counter - 2);

    }

}
