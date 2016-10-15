/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipequintanilha
 */
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.Scanner;


public class Quiz {
    
    private Conto contoRelacionado;
    private Pergunta pergunta;
    private Resposta resposta;

    public Quiz(Conto contoRelacionado, Pergunta pergunta, Resposta resposta) {
        this.contoRelacionado = contoRelacionado;
        this.pergunta = pergunta;
        this.resposta = resposta;
    }       
    
    void iniciarQuiz(){
        
        //Ler Arquivo
    }
    
    public int calcularResultado(){
        
    }
}
