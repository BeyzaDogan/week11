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

public class homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.println("matrisin satır sayısını girin:");
        int n = input.nextInt();
        int[][] A = new int[n][n];
        int t = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("A'nın" + i + "nci satırı" + j + "ninci sütununu girin:");
                A[i][j] = input.nextInt();
                if ((i + j) <=n) {
                    t += A[i][j];
                }

            }
        }
        System.out.print("A matrisinin yedek köşegen üzeri toplamı:" + t);

    }
}
