/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;

/**
 *
 * @author Daiane
 */
public class Conto {
    private int idConto;
    private String nome;
    private String enredo;
    private String dificuldade;

    public Conto() {
	super();
    }

    public Conto(String nome, String enredo, String dificuldade) {
	super();
	this.nome = nome;
	this.enredo = enredo;
	this.dificuldade = dificuldade;
		
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnredo(String enredo) {
        this.enredo = enredo;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
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
