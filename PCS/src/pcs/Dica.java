/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;

/**
 *
 * @author Gabriel Ramos
 */
public class Dica {
    private char palavra;
    private char dica;
    private String descricao;
    
    public Dica(char palavra, char dica, String descricao) {
        this.palavra = palavra;
        this.dica = dica;
        this.descricao = descricao;
    }
    
    public char getPalavra() {
        return palavra;
    }

    public char getDica() {
        return dica;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
    public void setPalavra(char palavra) {
        this.palavra = palavra;
    }

    public void setDica(char dica) {
        this.dica = dica;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void exibirDica(){
      
    }

}
