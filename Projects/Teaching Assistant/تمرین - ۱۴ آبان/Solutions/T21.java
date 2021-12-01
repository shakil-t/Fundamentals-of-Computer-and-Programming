/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t21;

/**
 *
 * @author shakil
 */
public class T21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0;i<21;i++){
            for(int j=1;j<6;j++){
                for(int k=0;k<j;k++){
                    System.out.print("*");
                }
                System.out.println();
        }
            for(int l=4;l>=0;l--){
                for(int m=l;m>0;m--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
}
