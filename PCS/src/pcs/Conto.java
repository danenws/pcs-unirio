/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;
import java.io.*;     

/**
 *
 * @author Daiane
 */
public class Conto {

    private final String nome;
    private final String enredo;
    private final String dificuldade;
    
    Conto(contoBuilder builder) {

	this.nome = builder.nome;
	this.enredo = builder.enredo;
	this.dificuldade = builder.dificuldade;
		
    }

    public String getNome() {
        return nome;
    }

    public String getEnredo() {
        return enredo;
    }

    public String getDificuldade() {
        return dificuldade;
    }

   
}
