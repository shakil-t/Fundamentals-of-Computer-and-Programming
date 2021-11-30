/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q19;

/**
 *
 * @author Shakila
 */
import java.util.Scanner;
public class Q19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println(" Enter the number of the elements ");
        n = input.nextInt();
        double sumOdd=0;
        int odd=0;
        double sumEven=0;
        int even=0;
        System.out.println(" Enter the numbers ");
        for(int i=0;i<n;i++){
            double m;
            m = input.nextDouble();
            if(m%2==0){
                sumEven+=m;
                even++;
            }else{
                sumOdd+=m;
                odd++;
            }
        }
        double aveOdd=sumOdd/odd;
        double aveEven=sumEven/even;
        if(aveOdd==aveEven){
            System.out.println(" They're equal ");
        }else{
            if(aveOdd>aveEven){
                System.out.println(" The average of the odd numbers is greater than the other one ");
            }else{
                System.out.println(" The average of the odd numbers is less than the other one ");
            }
        }
    }
    
}
