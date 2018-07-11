/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.pkg07;

/**
 *
 * @author Kemal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String cumle="merhaba benim ismim kemal emre ballı";
        cumle=cumle.toUpperCase();//cumle değişkenini yazıp nokta koyduğumuzda bize seçenek verir ve touppercase işlemi bütün harfleri büyütür.
        int ilkbosluk =cumle.indexOf(" ");//string değerin içindeki ilk boşluğu bularak ilkbosluk değişkenin içine atıcak.bundan sonra cumle stringi büyük yazılcak.
        //eğer " işareti kullanırsak string ' kullanırsak char anlamına gelir.
        String ilkkelime= cumle.substring(0, ilkbosluk);//burada 0. karakter ile ilk bosluk arasındaki kelimeyi aldık.
        String ilkharic=cumle.substring(ilkbosluk);//burada ilk kelime hariç hepsini gösterdik.
        int uzunluk=cumle.length();//burada cumlenin uzunluğunu değişkene attık.
        String altcızgı=cumle.replace("MERHABA", "KEMAL");//burada 'merhaba' ile 'kemal' kelimesinin yerini değiştirdik.
        
        int bharfi=cumle.indexOf("BE");//bu cumlede BE gecen yerı bulduk;
        int sonbosluk=cumle.lastIndexOf(" ");
        String sonkelime = cumle.substring(sonbosluk);
        
        
        
        
        System.out.println(bharfi+"\n"+sonkelime);
        System.out.print(cumle+"\nİlk boşluk "+ilkbosluk+"\n"+ilkkelime+"\n"+ilkharic+"\n cümle uzunluğu "+uzunluk+"\n"+altcızgı);
        System.out.println("\ncumlenın 10. harfi="+cumle.charAt(10));
        
        cumle=cumle.toLowerCase();
        System.out.print("\n"+cumle);
    }
    
}/*
ÇIKTI>>
8
 BALLI
MERHABA BENİM İSMİM KEMAL EMRE BALLI
İlk boşluk 7
MERHABA
 BENİM İSMİM KEMAL EMRE BALLI
 cümle uzunluğu 36
KEMAL BENİM İSMİM KEMAL EMRE BALLI
cumlenın 10. harfi=N

merhaba benim ismim kemal emre ballı

*/
