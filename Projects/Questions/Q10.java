/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q10;

/**
 *
 * @author Shakila
 */
public class Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int start=10;
        int finish=20;
        int m=(finish-start)/2;
        System.out.print(start);
        for(int i=0;i<m;i++){
            start+=2;
            System.out.print(" " + start);
        }
    }
    
}
