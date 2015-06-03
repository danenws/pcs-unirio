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
    private int idUsuario;
    private String nome;
    private String genero;
    private String dataNascimento;
    
    private String [] usr = null;   
    
    public Usuario() {
		super();
	}

    public Usuario(String nome, String genero, String dataNascimento) throws IOException {
        super();
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
                FileWriter f = new FileWriter(file,true); // true e para adicionar nova linha
                f.write(n+"\r\n");//Pula uma linha após escrever o texto
                f.close();

            } catch (IOException ex) {  
                ex.printStackTrace();  
            }  
        } 
  }
    
    
    void mostrarUsers() throws FileNotFoundException{
        
        Scanner scanner = new Scanner(new FileReader("usuarios.txt"))
                       .useDelimiter("\\||\\n");
        while (scanner.hasNext()) {
           nome = scanner.next();
           genero = scanner.next();
           dataNascimento = scanner.next();
          System.out.println(nome);
          System.out.println(genero);
          System.out.println(dataNascimento);
        }
        
    }
    
     public int contarUsers(String arquivo) throws FileNotFoundException{//Ver quantas paginas tera o conto
        int flag = 0;
        
        Scanner scanner = new Scanner(new FileReader("usuarios.txt"))
                       .useDelimiter("\\||\\n");
        while (scanner.hasNext()) {
           nome = scanner.next();
           System.out.println("nome: " + nome);
           genero = scanner.next();
           dataNascimento = scanner.next();
           flag++;
           System.out.println("flag contada user2: " + flag);
        }
        return flag;
        
        
    }
    
   
    
     
     public String mostrarUsersName(int pos, String arquivo) throws FileNotFoundException {  
        System.out.println("oi");
        int flag = contarUsers(arquivo);    
        System.out.println(flag);
        usr = new String[flag]; 
        int i =0;
        if(pos<flag){//se tiver um nome naquela posicao no arquivo, pega o nome
            Scanner scanner = new Scanner(new FileReader(arquivo))
                           .useDelimiter("\\||\\n");
            while (scanner.hasNext()) {
               nome = scanner.next();
               genero = scanner.next();
               dataNascimento = scanner.next();
                usr[i]= nome; 
                System.out.println("flag nome " + usr[i]);
                i++;
            }
           
        } else{
            usr[pos] = "<Nome>";
        }
           return usr[pos]; //retorna o nome naquela posicao
        
    }
   
      
      
    public void mostrarUsersName2(String arquivo) throws FileNotFoundException{
        int flag = contarUsers(arquivo);    
        System.out.println(flag);
        usr = new String[flag]; 
        
        Scanner scanner = new Scanner(new FileReader("usuarios.txt"))
                       .useDelimiter("\\||\\n");
        while (scanner.hasNext()) {
           nome = scanner.next();
           genero = scanner.next();
           dataNascimento = scanner.next();
          System.out.println(nome);
          //ver se precisa retornar
        }
        
    }
    public void mostrarUsersName() throws FileNotFoundException{
        
        Scanner scanner = new Scanner(new FileReader("usuarios.txt"))
                       .useDelimiter("\\||\\n");
        while (scanner.hasNext()) {
           nome = scanner.next();
           genero = scanner.next();
           dataNascimento = scanner.next();
           
          System.out.println(nome);
          //ver se precisa retornar
        }
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
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
