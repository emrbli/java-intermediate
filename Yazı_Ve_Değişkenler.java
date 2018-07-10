# java
Temel Java Komutları - Basic Java Commands
/*

To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
*/
package ılkjava;
/**
*

@author Kemal
*/
public class IlkJava {

/**

@param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
System.out.println("Kemal");//Java'da büyük küçük harf önemlidir >> System gibi.
int a=10;//int sayı değişkeni içindir.
int kemal;//değişkenin içine bir değer atamadanda değişken yazılabilir.
kemal=10;//diyerek sonradan bu değişkeni değerlendirebiliriz.
System.out.println("Merhaba Dünya "+kemal);//diyerek değişkeni yazdırabiliriz.
/*Çıktımız >>
Kemal
Merhaba Dünya 10 << şeklinde olacaktır.
*/

kemal=20;//Burda değişkenin içindeki değeri sonradan değiştirdik Java'nın bir özelliğidir.Değişken bir kutu olarak düşünebilriz.
System.out.println("Merhaba Dünya "+kemal);
/*Çıktımız >>
Merhaba Dünya 20 << Şeklinde olacaktır.
*/

float pi=(float) 3.14;//float veri tipi ondalık sayılar içindir yalnız (float pi=3.14) yazarsak hata alrız 3.14 bir doubledır
//double olan sayıyı floata çevirmek için atadığımız sayının önüne (float) yazdık. double pi=3.14 şeklinde yazabiliriz.
//double ile float ın farkı veri boyutudur.

String s="Benim ismim Kemal ";//String dizgiler içindir yanı harf karakteri içerir. >> 'S' büyük yazılır.

System.out.print(s+" pi:"+ pi);// Çıktımız >> Benim ismim Kemal pi:3.14 << şeklinde çıkacaktır.

//Kaynak/Source>>BilgisayarKavramları

}

}
