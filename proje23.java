//klavyeden girilen  pozitif tam sayıyı tersten yazdıran program
package algoritmaprojeleri;

import java.util.Scanner;

public class proje23 {
    public static void main(String[] args) {            
    Scanner scan =new Scanner(System.in);
    
    int a,k,b=0;
        System.out.println("Lütfen bir sayı giriniz:");
        a=scan.nextInt();
        System.out.println("Girdiğiniz sayının testen yazılışı:");        
        while(a>0){
           k = a % 10 ;    
           b=b*10+k;
              a /=10;                                              
        }
        System.out.println(b+a);
    }
}
7