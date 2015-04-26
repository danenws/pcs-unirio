/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipequintanilha
 */
import java.util.*;

public class Historico {
    
    private Usuario usuario;
    private Quiz quiz;
    private float nota;
    private Date data; 
    
    Historico(Usuario usuario, Quiz quiz, float nota, Date data){
        
        this.usuario = usuario;
        this.quiz = quiz;
        this.nota = nota;
        this.data = data;
        
    }
    void gerarHist(){
        
    }
    
    
}
