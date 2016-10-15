/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Scanner;

/**
 *
 * @author Daiane
 */
public class Usuario {
 
    private final String nome;
    private final String genero;
    private final String dataNascimento;
    

    Usuario(usuarioBuilder builder) {
        
	this.nome = builder.nome;
	this.genero = builder.genero;
	this.dataNascimento = builder.dataNascimento;
 
  }
      
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }
    
     public String getDataNascimento() {
        return dataNascimento;
    }

}
