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

public class homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("A matrisinin satır sayısını girin:");
        int n = input.nextInt();
        int[][] A = new int[n][n];
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            System.out.println("A matrisinin"+i+"nci satırını ve "+j+"nci sütununu girin:");
            A[i][j]=input.nextInt();
                    
          }
        }
       for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              if(A[i][j]==A[j][i]){
              System.out.println("A matrisi simetriktir");
              }
              else{
              System.out.println("A matrisi simetrik değildir");
              }
          }
    }

}
    }