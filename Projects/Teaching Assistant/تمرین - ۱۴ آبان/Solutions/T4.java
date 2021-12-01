/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4;

/**
 *
 * @author shakil
 */
import java.util.Scanner;
public class T4 {

    /**
     * @param args the command line arguments
     */
    public static void fahrenheitDegree(double c) {
        double f=c*1.8+32;
	System.out.println("Fahrenheit:"+f);
    }
    public static void celsiusDegree(double f) {
	double c=(5*(f-32))/9;
	System.out.println("Celsius:"+c);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
	double c1;
	System.out.println("Celsius:");
	c1=input.nextDouble();
	fahrenheitDegree(c1);
	//double f1;
	//System.out.println("Fahrenheit:");
	//f1=input.nextDouble();
	//celsiusDegree(f1);
    }
    
}
