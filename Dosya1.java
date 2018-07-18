/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosya;

import java.io.*;


/**
 *
 * @author Kemal
 */
public class Dosya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      File f=new File("a.txt");
      try{
      FileReader fr = new FileReader(f);
      int c = fr.read();
      
      while(c!=-1){
         char k=(char)c;
         System.out.print(k+" ");
          c = fr.read();
          
      }
      fr.close();
      f=new File("a.txt");
      BufferedReader br=new BufferedReader(new FileReader(f));
      System.out.println(br.readLine());
      br.close();
      File cikti=new File("cikti.txt");//bu satır dosya yazmak için.
      FileWriter fw=new FileWriter(cikti);// buda
      fw.write("bilgisayar kavramlari deneme mesajı");//buda
      fw.close();//bu dosyayı kapatmak için.
      
      }catch(Exception e)
      { 
          e.printStackTrace();
      }
    }
    
}
