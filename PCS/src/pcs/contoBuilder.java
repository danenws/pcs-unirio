/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author felipequintanilha
 */
public class contoBuilder {
    
   
    String nome;
    String enredo;
    String dificuldade;
    RandomAccessFile objeto;  
    public String [] cont;  
    
    /**
     *
     * @param nome
     * @param enredo
     * @param dificuldade
     */
    public contoBuilder(String nome, String enredo, String dificuldade){
        
        this.nome = nome;
        this.enredo = enredo;
        this.dificuldade = dificuldade;
        
    }
    
    public int tamanhoConto(String arquivo) throws FileNotFoundException{//Ver quantas paginas tera o conto
        
        int flag = 0;
        try {  
            Scanner scanner = new Scanner(new FileReader(arquivo));
            while (scanner.hasNext()) {
                String text = scanner.next();
                if(text.equals("*")){//conta quantos * tem no arquivo
                    flag++;
                    //System.out.println(flag);
                    //System.out.println(Arrays.toString(cont));
                }
            }
            return flag;
        }
        catch (FileNotFoundException ex){
        }
     
       return 1;
    }
    
    public String lerContoPos(int pos, String arquivo) {  
        try {  
            int flag = tamanhoConto(arquivo);            
            Scanner scanner = new Scanner(new FileReader(arquivo))
                       .useDelimiter("\\*");//usa * como delimitador para quebrar nas posicoes do vetor
            while (scanner.hasNext()) {
                cont = new String[flag]; // inicializa o vetor com o tamanho do arquivo  
                for (int i = 0; i < flag; i++) {  
                        cont[i]= scanner.next(); 
                        
                }    
            }
            
            return cont[pos]; 
        }
        catch (FileNotFoundException ex){
            
        }
        
        return null;
    }
    
    // método que retorna o vetor contendo as informações do arquivo    
    public String[] lerConto(String arquivo) {  
        try {  
   
            int flag = tamanhoConto(arquivo);

            Scanner scanner = new Scanner(new FileReader(arquivo))
                       .useDelimiter("\\*");
            while (scanner.hasNext()) {
                cont = new String[flag]; // inicializa o vetor com o tamanho do arquivo  
                for (int i = 0; i < flag; i++) {  
                        cont[i]= scanner.next(); 
                }    
            }
          
            
            return cont;  
        } catch (FileNotFoundException ex) { // trata as exceções do tipo FileNotFoundException   
            
        }
             
        return null; // só retorna null se der algum erro  
    }

 
   public contoBuilder(){
       
       super();
   }
    

    public contoBuilder setNome(String nome) {
        
        this.nome = nome;
        return this;
    }

   
    public contoBuilder setEnredo(String enredo) {
        this.enredo = enredo;
        return this;
    }


    public contoBuilder setDificuldade(String dificuldade) {
        
        this.dificuldade = dificuldade;
        return this;
    }

    public String[] getCont() {
        return cont;
        
    }

    public void setCont(String[] cont) {
        this.cont = cont;
    }
    
    public Conto build() {
            
        return new Conto(this);
        
    }
    

    
}
