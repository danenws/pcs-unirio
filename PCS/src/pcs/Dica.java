/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;


import javax.swing.*;    
import java.io.*;     
import java.util.*;

/**
 *
 * @author Gabriel Ramos
 */
public class Dica {
    private char palavra;
    private String dica;
    private String descricao;
    
    public Dica(char palavra, String dica, String descricao) {
        this.palavra = palavra;
        this.dica = dica;
        this.descricao = descricao;
    }
    
        public Dica() {
    }
    
    public char getPalavra() {
        return palavra;
    }

    public String getDica() {
        return dica;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
    public void setPalavra(char palavra) {
        this.palavra = palavra;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String exibirDica(String arquivo) throws FileNotFoundException{        
        String dica21 = null; 
        try{
            Scanner scanner = new Scanner(new FileReader(arquivo)).useDelimiter("\\*");
            dica21=scanner.next(); 
            return dica21;  
            }catch (FileNotFoundException ex) { // trata as exceções do tipo FileNotFoundException   
            ex.printStackTrace();  
        } catch (IOException ex) { // trata as exceções do tipo IOException   
            ex.printStackTrace();  
        } 
        return dica21;  
}
}
    
