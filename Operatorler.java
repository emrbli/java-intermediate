/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package islemler;

/**
 *
 * @author Kemal
 */
public class İslemler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=10,b=20,c=30;
        System.out.println("sonuc1 : "+(a+b));
        System.out.println("sonuc2 : "+a+b);//bu işlemde teker teker yazıcaktır.>> 10 20 diye
        System.out.println("sonuc3 : "+a*b);//bunu yaparken parantez koymamıza gerek yok işlem önceliği çarpmadadır.
        System.out.println("sonuc4 : "+(a/b));//bu işlemde 0 olarak çıkar normalde 0.5 çıkması gerek bunun için floata çevireceğiz.
        System.out.println("sonuc5 : "+((float)a/(float)b));//burada değişkenleri floata çevirdik.
        System.out.println("sonuc6 : "+(a-b));
        System.out.println("sonuc7 : "+(10>>2));//burada ikilik tabanda çevirerek iki defa sağa kaydırır
        //normale 10 sayısı ikilik tabanda 1010 diye yazılır.biz iki defa shift ederek sola 00 yazdırdık 0010 oldu
        System.out.println("sonuc8 : "+(10<<2));//burada 1000 yaptık
        System.out.println("sonuc9 : "+(10>>>2));
        System.out.println("sonuc10 : "+(a<b));//boolean operatoru doğru ise true yanlış ise false değer girer.
        System.out.println("sonuc11 : "+(a>b));
        System.out.println("sonuc12 : "+(a==b));//eşitmi diye sorduk eğer bir tane eşittir koyarsak içine atama yapar a nın kendi değeri yerine b nin değerini alır
        System.out.println("sonuc13 : "+(a!=b));//eşit değilmi dedik
    }
    /* 
    Çıktımız>>
    sonuc1 : 30
        sonuc2 : 1020
        sonuc3 : 200
        sonuc4 : 0
        sonuc5 : 0.5
        sonuc6 : -10
        sonuc7 : 2
        sonuc8 : 40
        sonuc9 : 2
        sonuc10 : true
        sonuc11 : false
        sonuc12 : false
        sonuc13 : true
    
    
    
    
    
    
    ikilik sayıyı 10 luk sayıya çevirirken 
    1110 sayısı ikilik sayıdır bunu 10 luk sisteme çevirelim
    sağdan sola doğru 
    0 tane 2^0
    1 tane 2^1
    1 tane 2^2
    1 tane 2^3
    sonra toplarız cevap=0+2+4+8=14 çıkar 
    yani 1110 sayısı 10 luk sistemde 14 yapar
    */
}
