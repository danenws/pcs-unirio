/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Daiane
 */
public class DicaBuilder {
    
    char palavra;
    String dica;
    String descricao;
    
    public DicaBuilder(char palavra, String dica, String descricao) {
        this.palavra = palavra;
        this.dica = dica;
        this.descricao = descricao;
    }
    
    public DicaBuilder() { }
    
    public Dica build() {
            return new Dica(this);
    }
    
    public String exibirDica(String arquivo) throws FileNotFoundException{        
        String flagDica = null; 
        try{
            Scanner scanner = new Scanner(new FileReader(arquivo)).useDelimiter("\\*");
            flagDica=scanner.next(); 
            return flagDica;  
            }catch (FileNotFoundException ex) { // trata as exceções do tipo FileNotFoundException   
            ex.printStackTrace();  
        } catch (IOException ex) { // trata as exceções do tipo IOException   
            ex.printStackTrace();  
        } 
        return flagDica;  
    }
        
}
 