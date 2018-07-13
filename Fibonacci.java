/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Kemal
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
        {
        // TODO code application logic here // Bu kodumuz döngülerle yazılmış fibonacci serisidir.
        int sayi1=1;
        int sayi2=1;//1,1,2,3,5,8,13,21.....
        int gecici;
            
             System.out.print(sayi1+"\n");
        for (int i = 0; i < 11; i++) {
            System.out.print(sayi2+"\n");
            gecici=sayi2;//sayi2 yi gecici ye atadık gecici 1 oldu
            sayi2=sayi1+sayi2;//sayi2 1+1 oldu
            sayi1=gecici;//sayi1 ise 1 sayısını geri aldı
            
            
       /*     Bu kodumuzda is dizilerle fibonacci çözümünü gösterdik.
        int fib[] =new int[10];//dizinin içini düzenlemeyi ayrı bir döngüde, 
        fib[0]=1;              //yazdırmayı ayrı bir döngüde yapmakta fayda var. 
        fib[1]=1;
        
        for (int i = 0; i < 8; i++)
        {
            fib[i+2]=fib[i+1]+fib[i];
        }
        for (int i = 0; i < 10; i++) 
        {
            System.out.println(fib[i]);
        }
            
            
            
        }*/
        
        
    }
    
}
