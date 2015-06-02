/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;
import javax.swing.*;    
import java.io.*;     
import java.util.*;

/**
 *
 * @author Daiane
 */
public class Conto {
    private int idConto;
    private String nome;
    private String enredo;
    private String dificuldade;
    RandomAccessFile objeto;  
    private String [] cont;   

    public Conto() {
	super();
    }

    public Conto(String nome, String enredo, String dificuldade) {
	super();
	this.nome = nome;
	this.enredo = enredo;
	this.dificuldade = dificuldade;
		
    }
    
    public int tamanhoConto(String arquivo){//Ver quantas paginas tera o conto
        int flag = 0;
        try {  
            Scanner scanner = new Scanner(new FileReader(arquivo));
            while (scanner.hasNext()) {
                String text = scanner.next();
                if(text.equals("*")){//conta quantos * tem no arquivo
                    flag++;
                    //System.out.println(flag);
                }
            }
            return flag;
        } catch (FileNotFoundException ex) { // trata as exceções do tipo FileNotFoundException   
            ex.printStackTrace();  
        } catch (IOException ex) { // trata as exceções do tipo IOException   
            ex.printStackTrace();  
        }     
        return 1;
    }
    
    public String lerContoPos(int pos, String arquivo) {  
        try {  
            int flag = tamanhoConto(arquivo);            
            Scanner scanner = new Scanner(new FileReader(arquivo))
                       .useDelimiter("\\*");//usa * como delimitador para quebrar nas posicoes do vetor
            while (scanner.hasNext()) {
                cont = new String[flag]; // inicializa o vetor com o tamanho do arquivo  
                for (int i = 0; i < flag; i++) {  
                        cont[i]= scanner.next(); 
                }    
            }
            
            return cont[pos];  
        } catch (FileNotFoundException ex) { // trata as exceções do tipo FileNotFoundException   
            ex.printStackTrace();  
        } catch (IOException ex) { // trata as exceções do tipo IOException   
            ex.printStackTrace();  
        }       
        return null; // só retorna null se der algum erro 
    }
    
    // método que retorna o vetor contendo as informações do arquivo    
    public String[] lerConto(String arquivo) {  
       // int flag = 0;
        try {  
            /*Scanner scanner = new Scanner(new FileReader(arquivo));
            while (scanner.hasNext()) {
                String text = scanner.next();
                if(text.equals("*")){
                    flag++;
                    System.out.println(flag);
                }
            }*/
            
            int flag = tamanhoConto(arquivo);
            //System.out.println("flag2: " + flag);
            
            Scanner scanner = new Scanner(new FileReader(arquivo))
                       .useDelimiter("\\*");
            while (scanner.hasNext()) {
                cont = new String[flag]; // inicializa o vetor com o tamanho do arquivo  
                for (int i = 0; i < flag; i++) {  
                        cont[i]= scanner.next(); 
                }    
            }
            /*File arq = new File(arquivo);     
            objeto = new RandomAccessFile(arq , "rw");  
            cont = new String[flag]; // inicializa o vetor com o tamanho do arquivo  
            for (int i = 0; i < flag; i++) {  
                if(objeto.readLine()!= "*"){
                    cont[i]= objeto.readLine();  
                }
            }    */
            
            return cont;  
        } catch (FileNotFoundException ex) { // trata as exceções do tipo FileNotFoundException   
            ex.printStackTrace();  
        } catch (IOException ex) { // trata as exceções do tipo IOException   
            ex.printStackTrace();  
        }       
        return null; // só retorna null se der algum erro  
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
