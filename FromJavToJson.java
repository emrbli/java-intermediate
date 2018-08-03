/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gsonexample;

import com.google.gson.Gson;
import java.io.*;
import java.util.*;


/**
 *
 * @author Kemal
 */

public class FromJavaToJson {
    public static void main(String[] args) 
    {
        
        
        
        Person person =new Person();
        person.setName("Kemal Emre");
        person.setSurname("Ballı");
        person.setCity("İstanbul");
        
        Person person2 =new Person();
        person2.setName("Thiery");
        person2.setSurname("Henry");
        person2.setCity("Arsenal");
        
        Person person3 =new Person();
        person3.setName("Zinedine");
        person3.setSurname("Zidane");
        person3.setCity("Madrid");
          
        
        List<Person> personList =new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        personList.add(person3);
        
        Gson gson =new Gson();
        System.out.println(gson.toJson(personList));  
        MetinYaz yaz =new MetinYaz();
        yaz.yaz(gson.toJson(personList));
        
        
    }
}
