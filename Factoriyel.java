/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktoriyel;

import java.util.Scanner;

/**
 *
 * @author Kemal
 */
public class Faktoriyel {

    /**
     * @param args the command line arguments
     */
    
    public static int factorial(int num)
    {
        int b =1;
    
    for(int i=2;i<=num;i++)//2 ile başlamamızın sebebi 0 ile sıfırlamamak 1 ile tekrarlamamak.
      {
        b=i*b;
        
      }
      System.out.println(b);
      return num;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
   // girilen sayının faktöriyelini almak.
    int a;
    a =input.nextInt();
   
    factorial(a);
      
  }   
  
    }
    

