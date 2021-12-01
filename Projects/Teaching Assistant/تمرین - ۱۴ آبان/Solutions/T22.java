/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t22;

/**
 *
 * @author shakil
 */
public class T22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0;i<1001;i++){
        for(int j=1;j<=7;j++){
            for(int k=1;k<=j;k++){
                System.out.print(k+" ");
            }
            for(int k=j-1;k>= 1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    }
    
}
