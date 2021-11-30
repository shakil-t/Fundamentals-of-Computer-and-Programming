/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

/**
 *
 * @author Shakila
 */
import java.util.Scanner;
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // This code prints the prime numbers from 1 to n
      Scanner scanner=new Scanner(System.in);
      int i=1;
      int num=0;
      //Empty String
      String PrimeNumbers= "" ;
      System.out.println(" Enter the value of n:100");
      int n=scanner.nextInt();
      for(i=1;i<=n;i++){
          int counter=0;
          for(num=i;num>=1;num--){
              if(i%num==0){
                  counter=counter+1;
              }
          }
          if(counter==2){
              //Appended the prime number to the string
              PrimeNumbers = PrimeNumbers+ i + " " ;
          }
      }
      System.out.println(" Prime Numbers from 1 to n are: ");
      System.out.println(PrimeNumbers);
    }
    
}
