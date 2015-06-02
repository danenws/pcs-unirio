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
    
    private String [] cont;   
    
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
<<<<<<< HEAD
   
    public int contarUsers(String arquivo) throws FileNotFoundException{
        int cont = 0;
        Scanner scanner = new Scanner(new FileReader(arquivo))
                       .useDelimiter("\\n");//ver quantas linhas tem o arquivo
        while (scanner.hasNext()) {
           cont++;
        }
        return cont;
        
    } 
    
   
       public String mostrarUsersName(int pos, String arquivo) {  
        try {  
            int flag = contarUsers(arquivo);//qtd de usuarios no arquivo            
            Scanner scanner = new Scanner(new FileReader(arquivo))
                       .useDelimiter("\\||\\n");//usa | como delimitador para quebrar nas posicoes do vetor
            while (scanner.hasNext()) {
                cont = new String[flag]; // inicializa o vetor com o tamanho do arquivo  
                for (int i = 0; i < flag; i++) {  
                    nome = scanner.next();
                    genero = scanner.next();
                    dataNascimento = scanner.next();
                    cont[i]= nome; 
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
      
=======
    
    void mostrarUsersName() throws FileNotFoundException{
        
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
>>>>>>> origin/master

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
