package pcs;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Ramos
 */
public class Pergunta {
    
    private String pergunta;
    private Resposta resposta;
    
    public Pergunta(){
    }
    

    public String getPergunta(String arquivo) throws FileNotFoundException{     
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
    

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public Resposta getResposta() {
        return resposta;
    }

    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
} 
}
