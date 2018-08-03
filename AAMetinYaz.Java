/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gsonexample;

import java.io.*;
/**
 *
 * @author Kemal
 */
public class MetinYaz {//not defterine yazdırmak için class oluşturduk.
    public void yaz(String yazi){//burada ayrı method oluşturup yazdıracağız.
        try  {
            File dosya=new File("C:\\Users\\Kemal\\Desktop\\gson.txt");
            FileWriter yazici = new FileWriter(dosya,true);
            BufferedWriter yaz = new BufferedWriter(yazici);

            yaz.write(yazi);
            yaz.close();
            }
            catch(Exception ex) {
                System.out.println("Dosya Yazmada HATA!");
            }//bu sayede json dosyasını not defterine yazdırdık.
    }
}
