/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivan.and.natasha.messages;

import java.util.Scanner;

/**
 *
 * @author shakil
 */
public class IceCreamShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ivan wants to buy ice cream and this code computes the number of scopes he can buy based on his money
        Scanner scan = new Scanner(System.in);
        int numScopes = scan.nextInt();
        int iceCreamPrice = scan.nextInt();
        int IvansMoney = scan.nextInt();
        int neededMoney = 0;
        for (int k = 1; k < numScopes; k++) {
            neededMoney += k * iceCreamPrice;
        }
        if (IvansMoney < neededMoney) {
            System.out.println(neededMoney - IvansMoney);
        } else {
            System.out.println(0);
        }
    }
}
