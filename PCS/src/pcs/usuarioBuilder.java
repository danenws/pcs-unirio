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
import java.util.Scanner;

/**
 *
 * @author felipequintanilha
 */
public class usuarioBuilder {
    
    
    String nome;
    String genero;
    String dataNascimento;
    
    private String [] usr = null;   
   
    
    public usuarioBuilder() {
		
        super();
	
    }
    
     public usuarioBuilder(String nome, String genero, String dataNascimento) throws IOException {
        
        this.nome = nome;
	this.genero = genero;
	this.dataNascimento = dataNascimento;
        
        int flag = 0;
         
        Scanner scanner = new Scanner(new FileReader("usuarios.txt"))
                       .useDelimiter("\\||\\n");
        while (scanner.hasNext()) {
           String usr = scanner.next();
           if(usr.equals(nome)){
               flag = 1;
           }
        }
        
        
	if (flag == 0) {
            try {    //Salvando o novo usuarios no arquivo
                String n = nome + "|" + genero + "|" + dataNascimento;

                String file = "usuarios.txt";
                try (FileWriter f = new FileWriter(file,true) // true e para adicionar nova linha
                ) {
                    f.write(n+"\r\n");//Pula uma linha após escrever o texto
                } //Pula uma linha após escrever o texto

            } catch (IOException ex) {  
            }  
        }
        
  }
     
     public String mostrarUsersNamePosicao(int pos) throws FileNotFoundException{
       // System.out.println("POS ENTRADA: " + pos);
        String nom = null;
        int i = 1;
        Scanner scanner = new Scanner(new FileReader("usuarios.txt"))
                       .useDelimiter("\\||\\n");
        int flag = contarUsers(); 
        if(pos>flag){
            nom = "<Nome>";
        } else {
            while (scanner.hasNext()) {
               nome = scanner.next();
               genero = scanner.next();
               dataNascimento = scanner.next();
               //System.out.println("nome todos: " + nome);
               if(i == pos){
                   nom = nome;
                   break;
               }
               i++;
            }
        }  
        //System.out.println("nome na pos" + pos + ": "+ nom);
        return nom;
        
    }
     
    public int contarUsers() throws FileNotFoundException{//Ver quantas paginas tera o conto
        int flag = 0;
        
         Scanner scanner = new Scanner(new FileReader("usuarios.txt"))
                       .useDelimiter("\\||\\n");
        while (scanner.hasNext()) {
           nome = scanner.next();
           genero = scanner.next();
           dataNascimento = scanner.next();
           flag++;

        }
        return flag;
    } 
  
  
    public usuarioBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public usuarioBuilder setGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public usuarioBuilder setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public Usuario build(){
        
        return new Usuario(this);
    }
    
}
