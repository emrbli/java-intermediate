/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek.pkg16.pkg07;

/**
 *
 * @author Kemal
 */
public class Ornek1607 {//1 den 10 a kadar sayıların toplamı.

    /**
     * @param args the command line arguments
     */
    public static int f(int x)
    {//burada if koyarsak else koymak mecburdur çünkü iki defa return etmiş oluruz.
        if(x==10){
             System.out.println("x: "+x);
            return 10;
        }else{
           System.out.println("x: "+x);
           return x+f(x+1); 
        }    
        
    }
    //f(0): 0+f(1)
    //f(1): 1+f(2)
    //f(2): 2+f(3)
    //f(3): 3+f(4)
    //..
    //f(8): 8+f(9)
    //f(9): 9+f(10)
    //f(10): 10
    /*recursuve fonksiyonda şartları girdik eğer 10 değilse 2. return komutunu girdi
    ve f(10) u bulmaya çalıştı.
    */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //(Recersuve Denklem)...1'den 10'a kadar olan sayıların teker teker toplanması.
       
        System.out.println("f(0)"+f(0));
        /*int toplam=0;//for döngüsü ile yapılmış bölüm.
        for (int i = 0; i < 10; i++) {
            toplam += i+1;//i nin 1 falzasını toplar.
            System.out.println(" i "+i+" iken toplam= "+toplam);
        }
        System.out.println("Sonuç: "+toplam);
       */ 
    }
    
}
