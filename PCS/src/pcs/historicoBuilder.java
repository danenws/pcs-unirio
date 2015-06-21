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
public class historicoBuilder {
    
    String usuario; //como e apenas ler um arquivo, tera que ser string.
    String quiz;
    float nota;
    String data; //ler a data exatamente como foi gravada
    
    
    public historicoBuilder() {
	super();
    }
    
    public historicoBuilder(String usuario, String quiz, float nota, String data){
        
        this.usuario = usuario;
        this.quiz = quiz;
        this.nota = nota;
        this.data = data;
        
         try {    //Salvando o novo usuarios no arquivo
            String n = usuario + "|" + quiz + "|" + nota + "|" + data;
            
            String file = "historico.txt";
            try (FileWriter f = new FileWriter(file,true) // true e para adicionar nova linha
            ) {
                f.write(n+"\r\n");//Pula uma linha após escrever o texto
            } //Pula uma linha após escrever o texto
            
        } catch (IOException ex) {  
        }  
        
    }
    
    void gerarHist() throws FileNotFoundException{
        
        Scanner scanner = new Scanner(new FileReader("historico.txt"))
                       .useDelimiter("\\||\\n");
        while (scanner.hasNext()) {
           usuario = scanner.next();
           quiz = scanner.next();
           nota = Float.parseFloat(scanner.next());
           data = scanner.next();
          System.out.println(usuario);
          System.out.println(quiz);
          System.out.println(nota);
          System.out.println(data);
        }
        
    }
    //Gerar historico de determinado usuario
    void gerarHistUser(String user) throws FileNotFoundException{
        
        Scanner scanner = new Scanner(new FileReader("historico.txt"))
                       .useDelimiter("\\||\\n");
        while (scanner.hasNext()) {
           usuario = scanner.next();
           quiz = scanner.next();
           nota = Float.parseFloat(scanner.next());
           data = scanner.next();
           if(usuario.equals(user)){
                System.out.println(usuario);
                System.out.println(quiz);
                System.out.println(nota);
                System.out.println(data);
           }
        }
        
    }

    public historicoBuilder setUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public historicoBuilder setQuiz(String quiz) {
        this.quiz = quiz;
        return this;
    }

    public historicoBuilder setNota(float nota) {
        this.nota = nota;
        return this;
    }

    public historicoBuilder setData(String data) {
        this.data = data;
        return this;
    }
    
    public Historico build(){
        
        return new Historico(this);
    }
}
