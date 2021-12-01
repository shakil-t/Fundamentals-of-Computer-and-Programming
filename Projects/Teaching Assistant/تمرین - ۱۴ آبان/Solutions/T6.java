/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6;

/**
 *
 * @author shakil
 */
public class T6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //weight
        double w=73.3;
        //height
        double h=1.63;
        h=Math.pow(h,2);
        double BMI=w/h;
        if(18.5>BMI){
            System.out.println("Underweight");
        }
        if(18.5<=BMI && BMI<=25){
            System.out.println("Normal");
        }
        if(25<=BMI && BMI<=30){
            System.out.println("Overweight");
        }  
}
}
