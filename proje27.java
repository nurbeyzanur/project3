package projeler;
//klavyeden girilen iki tamsayının dost sayı olup olmadığını bulan program

import java.util.Scanner;

public class proje27 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a,b;
        int tpa=0,tpb=0;
        System.out.println("Lütfen ilk sayıyı giriniz:");
        a = scan.nextInt();
        
        System.out.println("Lütfen ikinci sayıyı giriniz:");
        b = scan.nextInt();
        
        for(int i=1;i<=a;i++){
            if (a%i==0) {
               tpa=tpa+i;                
            }            
        }
        for(int j=1;j<=b;j++){
            if (b%j==0) {
               tpb=tpb+j;                
            }            
        }
        if (tpa==tpb){
            System.out.println(a+" ve " +b+" dost sayılardır.");            
        }
        else{
            System.out.println("Girdiğiniz sayılar dost sayı değildir.");
        }
    }  
}
