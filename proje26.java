//girilen bir tam sayının iki sayının kareleri toplamı biçiminde yazılıp yazılmayacağını bulan program
package algoritmaprojeleri;

import java.util.Scanner;

public class proje26 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n,a,b,toplam;
        
        System.out.println("Lütfen bir n değeri giriniz:");
        n=scan.nextInt();
        
       for(a=1;a<=n;a++){
           for(b=1;b<=n;b++){
               if(a*a+b*b==n){
                
                   System.out.println(a+" ve "+b+" değerlerin karelerin toplamı "+n+" sayısına eşittir. ");
               
                   }   
            }
       }
    }
    
    
}