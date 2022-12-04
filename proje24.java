//Klavyeden girilen 1'den büyük tamsayının "asal çarpanlarını"bulan program
package algoritmaprojeleri;

import java.util.Scanner;


public class proje24 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a,b;
        System.out.println("Lütfen bir sayı değeri giriniz:");
        a = scan.nextInt();
        b = 2;
        while (a>1){
            if ( a%b==0) {
                System.out.print(b+" ");
                
            }
              a =a/b;
              b +=1;

        }
    }
}
