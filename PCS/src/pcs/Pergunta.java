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
    
     public Pergunta(PerguntaBuilder builder) {
        this.pergunta = builder.pergunta;
        this.resposta = builder.resposta;
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
