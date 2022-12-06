//x  v n değerlerine göre e^x hesaplayan program
package projeler;

import java.util.Scanner;

public class proje30 {
    public static void main(String[] args) {
        int x,n,sonuc;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen x değerini giriniz:");
        x = scan.nextInt();
        
        System.out.println("Lütfen n değerini giriniz:");
        n = scan.nextInt();
         sonuc = (1+x/n)^n;
         System.out.println("e^x değeri: "+ sonuc);
     }
}
