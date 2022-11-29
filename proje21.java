//klavyeden girilen n sayısına göre 1 den n e kadar olan tamsayıların toplamını (t1)
//1 den n e kadar olan tek tamsayıların toplamı(t2) 2 den n e kadar olan çift sayıların toplamı (t3)hesaplayan program
package algoritmaprojeleri;

import java.util.Scanner;

    public class proje21 {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int n,t1=0,t2=0,t3=0;
            System.out.println("Lütfen bir n değeri giriniz");
            n =scan.nextInt();
             for(int i=1;i<=n;i++){
                 t1=t1+i;                             
             }
             System.out.println("Birden n e kadar olan tamsayıların toplamı:"+t1);     
             for(int i=1;i<=n;i+=2){
                 t2+=i;                             
        }System.out.println("Birden n e kadar olan tek tamsayıların toplamı"+t2);
             for(int i=2;i<=n;i+=3){
                 t3+=i;                 
             }
             System.out.println("2 den n e kadar olan çift tamsayıların toplamı");
        }
}
