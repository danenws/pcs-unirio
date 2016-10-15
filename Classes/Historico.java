/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipequintanilha
 */
import java.text.DateFormat; //Para trabalhar com data 
import java.text.SimpleDateFormat; //Para trabalhar com data [Imprimir a data  System.out.println(dateFormat.format(date))]
import java.util.*;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.Scanner;

public class Historico {
    
    private int resultado; //Resultado será dado em porcentagem
    private DateFormat data; 
    
    public Historico(int resultado, Date data){
         
        this.resultado = resultado;
        this.data = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato que a data é exibida
        
    }

    public int getResultado() {
        return resultado;
    }

    public DateFormat getData() {
        return data;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void setData(DateFormat data) {
        this.data = data;
    }
    
    
    
    public void gerarHist() {
  
        //Ler Arquivo
        
    }
    
    
}
