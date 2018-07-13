/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donguleornek;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Kemal
 */
public class DonguleOrnek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner input=new Scanner(System.in);
       
        System.out.println("1-100 arasındaki tek sayılar için 1\n3 ve 7 ile bölünebilen sayılar için 2\n1-100 arasındaki 2 nin karelerini almak için 3'ü giriniz.");
        System.out.print("Seçeneğiniz =");
        a=input.nextInt();
        
        switch (a) {
            case 1:
                teksayi();//tek sayilari yazdırmak için bu fonksiyonu yazdık.
                break;
            case 2:
                ucveyedi();
                break;
            case 3:
                ikininüssü();
                break;
            default:
                System.out.println("Sadece 1 , 2 ve 3 değerleri girebilirsiniz!");
                break;
        }
            /*
            İlk olarak switch case girdik ama if-else kullanarak aşağıdaki gibide yapabiliriz
            if (a==1) {
                teksayi();//tek sayilari yazdırmak için bu fonksiyonu yazdık.
            }
           else if (a==2) {
                ucveyedi();
            }
            else if (a==3) {
                ikininüssü();
            }
            else  {
                System.out.println("Sadece 1 2 ve 3 değerleri girebilirsiniz!");
            }
        */
               
        }
        public static void teksayi()
        {
            for (int i = 0; i <=100; i++) 
            {
            if ((2*i+1)<100)
               System.out.println((2*i+1)); 
            }
    }
        public static void ucveyedi()
        {
            for (int i = 0; i <= 100; i++) 
            {
                if (i%3==0 && i%7==0)                
                    System.out.println(i);
            }
        }
        public static void ikininüssü()
        {
            for (int i = 0; i <100; i++) 
            {
                if (pow(2,i)<100) //1 ile 100 arasında olması için   
                    System.out.println((int)pow(2,i));//math kütüphanesini kullanarak pow ile karesini aldık.                 
            }
           
        }
}
