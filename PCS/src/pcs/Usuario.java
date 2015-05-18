/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;

import java.sql.Date;

/**
 *
 * @author Daiane
 */
public class Usuario {
    private int idUsuario;
    private String nome;
    private String genero;
    private java.sql.Date dataNascimento;

    public Usuario() {
	super();
    }

    public Usuario(String nome, String genero, java.sql.Date dataNascimento) {
	super();
	this.nome = nome;
	this.genero = genero;
	this.dataNascimento = dataNascimento;
		
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

   
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }
    
     public Date getDataNascimento() {
        return dataNascimento;
    }
    
     
    
   
  
}
