/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guess;

/**
 *
 * @author shakil
 */
import java.util.*;
public class Guess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int start=0;
        int finish=100;
        int m=(finish+start)/2;
        int n;
        int h=1,l=2,e=3;
        int[] array = new int[100];
        for(int j=0;j<100;j++){
            array[j]=j;
        }
        int r;
        int i;
        int counter=0;
        System.out.println(" Game rules : ");
        System.out.println(" After the gusstion of the computer enter the number of  h,l,e .");
        System.out.println(" h=1 shows that the computer's number is higher than yours ");
        System.out.println(" l=2 shows that the computer's number is lower than yours ");
        System.out.println(" e=3 shows that the computer's number is equal to yours ");
        System.out.println(" Are you ready? ");
        System.out.println(" Choose a number from 0 to 100 and keep it in your mind ");
        System.out.println(" Computer's guess is " + m );
        counter++;
        n = input.nextInt();
        if(n==3){
            System.out.println(" Computer won! ");
            System.out.println(" Computer guessed the number with " + counter + " attempts ");
        }else{
            switch(n){
            case 1:
                finish=m;
                counter++;
                break;
            case 2:
                start=m;
                counter++;
                break;
        }
        loop1:
            do{
                loop2:
                do{
                    Random generator;
                    generator = new Random();
                    r = generator.nextInt(finish);
                    for(i=0;i<100;i++){
                        if(array[i]==r){
                            continue loop2;
                        }
                    }
                }while(array[i]!=r||r<=start);
                System.out.println(" Computer's guess is " + r );
                n = input.nextInt();
                switch(n){
                    case 1:
                        finish=r;
                        counter++;
                        break;
                    case 2:
                        start=r;
                        counter++;
                        break;
                    case 3:
                        System.out.println(" Computer won! ");
                        System.out.println(" Computer reached the answer with " + counter + " attempts ");
                        break loop1;
                        
        }
            }while(n!=3);
        }
    }
    
}
