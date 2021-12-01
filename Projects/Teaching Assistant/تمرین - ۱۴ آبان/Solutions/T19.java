/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t19;

/**
 *
 * @author shakil
 */
import java.util.Scanner;
public class T19 {

    /**
     * @param args the command line arguments
     */
    public static void multiplicationTable(int row, int column){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                System.out.printf(" %3d ",i*j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int r;
        System.out.println("Enter the number of rows:");
        r=input.nextInt();
        int c;
        System.out.println("Enter the number of columns:");
        c=input.nextInt();
        multiplicationTable(r, c);
    }
    
}
