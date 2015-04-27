/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;
/**
 *
 * @author felipequintanilha
 */
public class Pergunta {
    
    private String pergunta;
    private String resposta;
    
    Pergunta(String pergunta, String resposta){
        
        this.pergunta = pergunta;
        this.resposta = resposta;
    }
    boolean corrigir(){
        return true;
    }
    
    String mostrarResp(){
        
        return resposta;
    }
}
