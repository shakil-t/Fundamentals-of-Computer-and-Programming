/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q21;

/**
 *
 * @author Shakila
 */

public class Q21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        loop:
       for(int i=2;i>0;i++){
           for(int j=2;j<=Math.sqrt(i);j++){
               if(i%j==0){
                   continue loop;
               }
       }
           System.out.println(i);
    }
    }
}
    

