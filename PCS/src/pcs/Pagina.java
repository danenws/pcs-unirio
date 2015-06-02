/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;
import java.util.*;
import java.io.*;


/**
 *
 * @author Gabriel Ramos
 */
public class Pagina {
    
    public void Avancar() throws FileNotFoundException{  
        
        Scanner scanner = new Scanner(new FileReader("arquivo.txt"))
                       .useDelimiter("\\*");
        while (scanner.hasNext()) {
          String parte = scanner.next();
          System.out.println(parte);
        }
    }   
    
    
}
