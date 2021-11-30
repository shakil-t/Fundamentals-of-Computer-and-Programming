/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

/**
 *
 * @author Shakila
 */
public class MultiplicationTable {
    public static void MultiplicationTable(int row, int column) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.printf(" %3d ", i * j);
            }
            System.out.println();
        }
        return;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // This code prints a n*n time table
        MultiplicationTable(10, 10);
    }
}
