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
public class Quiz {
    
    private Conto contoRelacionado;
    private Pergunta pergunta;
    
    Quiz(Conto contoRelacionado, Pergunta pergunta){
        
        this.contoRelacionado = contoRelacionado;
        this.pergunta = pergunta;
    }
    
    void iniciarQuiz(){
        
    }
}
