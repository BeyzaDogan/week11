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

public class homework7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        System.out.println("A matrisinin satır sayısını girin:");
        int n = input.nextInt();
        int[][] A = new int[n][n];
        int []B=new int[n];
        int gecici;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("A matrisinin" + i + "  nci satırı ve" + j + " ninci sütununu girin:");
                A[i][j] = input.nextInt();
                 
        }}
        for(int i=0;i<n;i++){
             for(int j = i+1; j <n; j++)
        {
            if(B[j] < B[i]){
                gecici = B[i];
                B[i] = B[j];
                B[j] = gecici;
            }
        }
    }
    for(int i = 0; i<n; i++)
    {
       System.out.println("KÜÇÜKTEN BÜYÜĞE SIRALANMIŞ HALİ:"+B[i]);
        }
         
        }
}
