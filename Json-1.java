/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_veri;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;



public class JSON_Veri {

 /**   
    public String ad;
    public String soyad;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public int yas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    **/
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        JSONObject ilkjson = new JSONObject();
        System.out.println(ilkjson);
        
        try
        {
            ilkjson.put("Adım","Kemal");
            System.out.println(ilkjson);
        }
        catch(JSONException ex)
        {
            //Logger.getLogger(JSON_Veri.class.getName()).log(Level.SEVERE, null ,ex);
            //logger kullanımı kısa olarak düzenli biçimde yazdırmamızı sağlar onun yerine println kullanabiliriz.
            System.out.println("Hata!"); //...gibi
        }
    }
    
}
