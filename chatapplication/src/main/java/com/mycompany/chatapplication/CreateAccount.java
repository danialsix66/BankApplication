/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapplication;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class CreateAccount {
    
    
        



/////////////////////////////////////////////////
    
    CreateAccount(){
        
        
         try {
            FileOutputStream fileOut = new FileOutputStream("Account.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            //String data1 = Name_nam.getText();
            
            ////fileWriter.write("NAME: "+data1+"LAST NAME: "+data2+"Phone Number: "+data3);
            //objectOut.writeObject();
            objectOut.close();
            fileOut.close();
            System.out.println("Object has been serialized");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    

    
    

