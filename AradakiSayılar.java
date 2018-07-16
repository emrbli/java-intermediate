/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg70.pkg83.arasıtoplamı;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Kemal
 */
public class Arasıtoplamı {

    /**
     * @param args the command line arguments
     */
    
    public static void toplam(int x,int y)
    {
        Scanner input=new Scanner(System.in);
        
         int top=0;   //döngü ile yapım.
         int c;
       for (int i = x; i <= y; i++)       {
         top=top+i;
       }
        
       
        System.out.println(y+" Toplama dahil olmasını istermisiniz?");
        System.out.println("EVET...[1]\nHAYIR...[2]");
        c=input.nextInt();
        switch (c)
                {
                    case 1 :
                        System.out.println(top);
                        break;
                    case 2:
                        System.out.println(top-y);
                        break;
                    default:
                        System.out.println("Yanlış giriş yaptınız.");
                        break;
        }
    }
    
    public static void main(String[] args) {
        int sayi1;
        int sayi2;
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci sayıyı giirniz.");
        sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        sayi2=input.nextInt();
        
        toplam(sayi1,sayi2);
    }
    
}
