/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipequintanilha
 */
public class Resposta {
    
    private String resposta;
    private Boolean certa = false;
    
    public Resposta(String resposta){
    
        this.resposta= resposta;
    }

    public String getResposta() {
        return resposta;
    }

    public Boolean getCerta() {
       
        return certa;
    }

    public void setCerta(Boolean certa) {
        this.certa = certa;
    }
  
    
    
    
}
