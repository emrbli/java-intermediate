/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme.pkg12.pkg07;

/**
 *
 * @author Kemal
 */
import static deneme.pkg12.pkg07.Deneme1207.nokta;
import java.util.Scanner;//veri almak için bu kütüphaneyi girdik.
public class Deneme1207 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //fibonacci tekrar
        Scanner input =new Scanner(System.in);//nesne almak için girdik
        
        int sayi1;
        int sayi2;
        
        System.out.println("Merhaba 1.sayıyı giriniz.\n");
        System.out.print("1.Sayı= ");
        sayi1 = input.nextInt();//int değer gireceğimiz zaman belli ediyoruz.
        System.out.println("2.sayıyı giriniz.");
        System.out.print("2.sayı= ");
        sayi2 = input.nextInt();
        input.close();
        
        nokta();//1 saniye bekleyip nokta koyması için yazdık
        nokta();
        nokta();
        int temp;
        System.out.println(sayi1);
        for (int i = 0; i < 10; i++) {
            temp=sayi2;
            sayi2=sayi1+temp;
            sayi1=temp;
            System.out.println(sayi2);
        }
        
        //System.out.println("Değerlerin Fiboncacci serisi oluşturuluyor");
        
    }
    
     public static void nokta(){
        try{// bu taraf denemek içindir.
            Thread.sleep(1000);//microsaniye  cinsinden olduğu için 1000 yazıp 1 saniye beklettik.
        }catch(InterruptedException ex){//cathc hata aldığında bu kodu çalıştırır
            Thread.currentThread().interrupt();//finally tarafını istemediğimiz için yazmadık finally de ise her ne olursa olsun içindeki kod çalışır
        }
        System.out.println(".");
        }
    
}
