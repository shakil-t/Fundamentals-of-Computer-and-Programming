/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypt;

/**
 *
 * @author shakil
 */
import java.io.*;
import java.util.Scanner;
import encrypt.InvalidCharException;
public class Encrypt {

    /**
     * @param args the command line arguments
     */
    public static void Encode(String s) throws InvalidCharException{
        for(int i=0;i<s.length();i++){
            char m=s.charAt(i);
            boolean k=Char(m);
            if(k==true){
                throw new InvalidCharException("Invalid Character");
            }else{
            if(m=='x'||m=='y'||m=='z'){
                System.out.print(m);
            }else{
                int n=(int)m;
                char o=(char)(n+3);
                System.out.print(o);
            }
            }
        }
        System.out.print(" ");
    }
    public static void Decode(String t) throws InvalidCharException{
        for(int j=0;j<t.length();j++){
            char m=t.charAt(j);
            boolean k=Char(m);
            if(k==true){
                throw new InvalidCharException("Invalid Character");
            }else{
            if(m=='a'||m=='b'||m=='c'){
                System.out.print(m);
            }else{
                int n=(int)m;
                char o=(char)(n-3);
                System.out.print(o);
            }
        }
        }
        System.out.print(" ");
    }
    public static boolean Char(char l){
        int r=(int)l;
        if(r<97||r>122){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args)
// TODO code application logic here
            throws FileNotFoundException{
        try{
        Scanner input1=new Scanner(new File("C:/Users/shakil/Files/caesar(encode).txt"));
        while(input1.hasNext()){
        String f=input1.next();
        Encode(f);
        }
    }catch(InvalidCharException e1){
            
            }
        System.out.println();
            try{
    Scanner input2=new Scanner(new File("C:/Users/shakil/Files/caesar(decode).txt"));
    while(input2.hasNext()){
        String g=input2.next();
        Decode(g);
    }
}catch(InvalidCharException e2){
}
    }
}
