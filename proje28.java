//matris ödevi
package algoritmaprojeleri;

import java.util.Scanner;

public class proje28 {
    public static void main(String[] args) {            
        Scanner input=new Scanner(System.in);        
        int a;   
        
        do {                               
        System.out.println("Satır sayısı giriniz.");
        a =input.nextInt();       
         } while (a<0);
        
        int b =0;
        for(int i=1 ; i <= a ; i++ ){
            for(int j=1; j<=a-b;j++){
            System.out.print("*");//yıldız
        }
            for(int j=1;j<=b;j++){//boşluk               
                System.out.print(" ");                                
            }
         b++;
            System.out.println();//alt satır
        }                                                    
    }
}