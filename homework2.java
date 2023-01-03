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

public class homework2 {

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
                System.out.println("A matrisinin" + i + "  nci satırı ve" + j + " ninci sütununu girin:");
                A[i][j] = input.nextInt();
               

                }

            }
        for(int i=1;i<=n-1;i++){
        t+=A[i][n-1]+A[n-1][i];
        
        }
               

        System.out.println("toplam:"+(t-A[n-1][n-1]));

    }
}
