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
public class Pagina {

    private Conto conto;
    private Dica dica;
    
    public Pagina(Conto conto, Dica dica) {
        this.conto = conto;
        this.dica = dica;
    }
    
    public Conto getConto() {
        return conto;
    }

    public Dica getDica() {
        return dica;
    }
    
    public void setConto(Conto conto) {
        this.conto = conto;
    }

    public void setDica(Dica dica) {
        this.dica = dica;
    }
    
    public void SolicitarDica(){   
    }
    
    public void Avancar(){       
    }   
    
    
}
