/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipequintanilha
 */
public class Pergunta {
    
    private String pergunta;
    private Resposta resposta; //Como criar um vetor de respostas para associar uma pergunta com um numero x de respostas?
    
    public Pergunta(String pergunta, Resposta resposta){
        
        this.pergunta = pergunta;  
        resposta = new Resposta();
        
    }

    public String getPergunta() {
        return pergunta;
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
    
    public boolean corrigir(){
        
        if((resposta.getCerta()==true)){
            return true;
        }
        else{
            return false;
        }
    }
    
}
