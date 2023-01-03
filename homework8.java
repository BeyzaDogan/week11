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

public class homework8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("A matrisinin satır sayısını girin:");
        int n = input.nextInt();
        int[][] A = new int[n][n];
       
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println("A matrisinin" + i + "  nci satırı ve" + j + " ninci sütununu girin:");
                A[i][j] = input.nextInt();

            }

        }
        for (int i = 0; i < n; i++){
           double ykar=0;
            for (int j = 1; j <= 12; j++) {
            ykar+=A[i][j];}
            ykar=ykar/12;
            System.out.println(i+".şirketin yıllık karı:"+ykar);

            }
        
        for(int i=0;i<n;i++){
         int fazlakar=A[i][1], fzkaray=1;
         int azkar=A[i][1],azkaray=1;
         for(int j=1;j<12;j++){
           if(A[i][j]<azkar){
           azkar=A[i][j];
           azkaray=j;}
           else{
           fazlakar=A[i][j];
           fzkaray=j;
           }
         }
         System.out.println(i+". şirket için:"+azkar+","+azkaray+","+fazlakar+"ve"+fzkaray);}
         for(int j=1;j<=12;j++){
         int az=A[1][j],azs=1;
         int fazla=A[1][j],fzs=1;
         for(int i=0;i<n;i++){
           if(A[i][j]<az){
            az=A[i][j];
            azs=1;
           }
           else{
               fazla=A[i][j];
               fzs=i;
           }
           System.out.println(j+". ay için:"+az+","+azs+","+fazla+"ve"+fzs);
           
         }
         
        }
        
    }
}
