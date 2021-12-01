/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9;

/**
 *
 * @author shakil
 */
import java.util.Scanner;
public class T9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //می توان از تابعی برای محاسبه میانگین استفاده کرد
        //همچنین می توان حاصل جمع را در حلقه اول محاسبه کرد و نیازی به حلقه دوم نیست
        Scanner input=new Scanner(System.in);
        double[] array=new double[20];
        System.out.println("Enter the numbers:");
        for(int i=0;i<array.length;i++){
            array[i]=input.nextDouble();
        }
        double sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println(sum/20);
    }
    
}
