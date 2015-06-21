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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Historico {
    
    private final String usuario; //como e apenas ler um arquivo, tera que ser string.
    private final String quiz;
    private final float nota;
    private final String data; //ler a data exatamente como foi gravada
    

    Historico(historicoBuilder builder) {
        
        
                
        this.usuario = builder.usuario;
        this.quiz = builder.quiz;
        this.nota = builder.nota;
        this.data = builder.data;
            
        
    }

    public String getUsuario() {
        return usuario;
    }

    public String getQuiz() {
        return quiz;
    }

    public float getNota() {
        return nota;
    }

    public String getData() {
        return data;
    }

    
}
