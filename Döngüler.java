/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.pkg07.donguler;

/**
 *
 * @author Kemal
 */
public class Donguler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //3 çeşit döngü bulunmaktadır.
       
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Mesaj"+i);
        }
       
        
        
        int i=0;
        while(i<10){
            System.out.println("döngü"+i);
            i++;
        }
       
        
        
        i=0;//i yi tekrar sıfırlıyoruz.
        do{
            System.out.println("loop"+i);
            i++;
        }while(i<10);
        /* do-while ile while döngüsünün farkı 
        do-while döngüsünde önce bir defa döngüyü çalıştırır
        sonra koşulu okur
        while ve for döngüsünde ise önce koşulu okur sonra döngüyü çalıştırır.
        */
    }
    
}
