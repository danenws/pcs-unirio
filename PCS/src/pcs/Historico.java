/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;
/**
 *
 * @author felipequintanilha
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Historico {
    
    private String usuario; //como e apenas ler um arquivo, tera que ser string.
    private String quiz;
    private float nota;
    private String data; //ler a data exatamente como foi gravada
    
    public Historico() {
	super();
    }
    
    Historico(String usuario, String quiz, float nota, String data){
        super();
        this.usuario = usuario;
        this.quiz = quiz;
        this.nota = nota;
        this.data = data;
        
         try {    //Salvando o novo usuarios no arquivo
            String n = usuario + "|" + quiz + "|" + nota + "|" + data;
            
            String file = "historico.txt";
            FileWriter f = new FileWriter(file,true); // true e para adicionar nova linha
            f.write(n+"\r\n");//Pula uma linha após escrever o texto
            f.close();
            
        } catch (IOException ex) {  
            ex.printStackTrace();  
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
    
}
