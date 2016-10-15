/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pcs;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 *
 * @author felipequintanilha
 */
public class Saver {
    
    public Saver(){}
    
    public void salvarJogo(historicoBuilder hist) throws FileNotFoundException{
        XMLEncoder xmlEncoder = null;
        
        
       
        try{
            System.out.println("OI!!!");
            xmlEncoder = new XMLEncoder(
            
                    new FileOutputStream("dadosjogo.xml"));
            xmlEncoder.writeObject(hist);
        }finally {
            
              if(xmlEncoder != null)
                xmlEncoder.close();
        }
    
    }
         
        
}
    
   

