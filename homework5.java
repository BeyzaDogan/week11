/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
import java.util.Scanner;

public class homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("A matrisinin satır sayısını girin:");
        int n = input.nextInt();
        int[][] A = new int[n][n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("A matrisinin" + i + "  nci satırı ve" + j + " ninci sütununu girin:");
                A[i][j] = input.nextInt();

            }
        }
        for (int i = 0; i < n; i++) {
            B[i] = 1;

            for (int j = 0; j < n; j++) {

                B[i] *= A[i][j];
                System.out.print(B[i] + ",");
            }
        }
    }

}
