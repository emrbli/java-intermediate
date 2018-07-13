/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metotlar.pkg13.pkg07;

/**
 *
 * @author Kemal
 */
public class Metotlar1307 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //Matematikteki fonksiyonlar => f(x)= 5x+10 gibi..
        System.out.println(f(10));//basit olarak 5*10+10=60 yaptı.
        System.out.println(g(3,2));
        System.out.println(f(g(3,5)));
        yaz();
        
    }
     
    
    public static int f(int x)//parametre döndürmesi için int yazdık ve parametresini ekledik.
       {
           return 5*x+10;
       }
    public static int g(int x,int y)
    {//ilk olarak return x*y*3 yazdım. Ve bu şekildede çalışır.
        return f(x*y*3);//hatta fonksiyonları içiçe kullanabilirim.
    }
    public static void yaz()//bir parametre döndürmemesi için void yazdık.
    {
        System.out.println("Fonksiyonlar Yazıldı.");
    }
}
/*Çıktı>>
60
100
1185
Fonksiyonlar Yazıldı.
*/
