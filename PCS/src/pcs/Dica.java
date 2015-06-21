/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;


import java.io.*;     
import java.util.*;

/**
 *
 * @author Gabriel Ramos
 */
public class Dica {
    private char palavra;
    private String dica;
    private String descricao;
    
    public Dica(DicaBuilder builder) {
        this.palavra = builder.palavra;
        this.dica = builder.dica;
        this.descricao = builder.descricao;
    }
    
    
    public char getPalavra() {
        return palavra;
    }

    public String getDica() {
        return dica;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
    
   