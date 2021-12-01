/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

/**
 *
 * @author shakil
 */
import java.util.Scanner;
public class T3 {

    /**
     * @param args the command line arguments
     */
    public static void circleArea(double radius) {
        radius=Math.pow(radius,2);
        double area=Math.PI*radius;
	System.out.println(area);
    }
	
    public static void circlePerimeter(double radius) {
        radius=2*radius;
	double perimeter=Math.PI*radius;
	System.out.println(perimeter);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //می تونید برنامه رو خیلی ساده تر بنویسید و حتی از توابع برای محاسبه محیط و مساحت استفاده نکنید
        Scanner input=new Scanner(System.in);
        double r;
        System.out.println("Enter the radius of the circle:");
        r=input.nextDouble();
        circlePerimeter(r);
        circleArea(r);
    }
    
}
