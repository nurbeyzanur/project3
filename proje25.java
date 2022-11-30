
package projeler;
//klavyeden girilen 1 den büyük tam sayının"asal çarpanları"nı bulan program
import java.util.Scanner;

public class proje25 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b=2;
        
        System.out.println("Lütfen bir sayı değeri giriniz: ");
        a = scan.nextInt();
       while (a>b){
           if (a%b==0) {
               System.out.print(b+ " ");               
           }           
           b+=1;              
       }
    }
    
    
}
