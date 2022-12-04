
package algoritmaprojeleri;
//yediden büyük tamsayılar için 3 ve 5 n katlarının toplamı biçiminde 3a+5b=S olarak yazılabilir.
//Girilen tamsayı için 3a ve 5b katlarını bulan program
import java.util.Scanner;

public class proje22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,s;
        System.out.println("Lütfen bir sayı değeri giriniz: ");
        s = scan.nextInt();
        
        for ( a = 0; a <= s/3; a++) {
            for ( b = 0; b <= s/5; b++) {
                if (3*a+5*b==s) {
                    System.out.println("a: "+a+" b:"+b);
                }
            }
        }
               
    }
 
}
