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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author felipequintanilha
 */
public final class historicoBuilder {
    
    String usuario; //como e apenas ler um arquivo, tera que ser string.
    String quiz;
    float nota;
    String data;
    
    public historicoBuilder() {
	super();
    }
    
    public historicoBuilder(String usuario, String quiz, float nota) throws ParseException{
        
        
        
        this.usuario = usuario;
        this.quiz = quiz;
        this.nota = nota;
        this.data = pegarData();
        
        
        
         /*try {    //Salvando o novo usuarios no arquivo
            String n = usuario + "|" + quiz + "|" + nota + "|" + data;
            
            String file = "historico.txt";
            try (FileWriter f = new FileWriter(file,true) // true e para adicionar nova linha
            ) {
                f.write(n+"\r\n");//Pula uma linha após escrever o texto
            } //Pula uma linha após escrever o texto
            
        } catch (IOException ex) {  
        }  
*/
       
    }
    
    public String gerarHist() throws FileNotFoundException{
        String retorno = "";
        String n;
        Scanner scanner = new Scanner(new FileReader("historico.txt"))
                       .useDelimiter("\\||\\n");
        while (scanner.hasNext()) {
           usuario = scanner.next();
           quiz = scanner.next();
           n = scanner.next();
           data = scanner.next();
           retorno = retorno + usuario + "                              " + quiz + "                                  " + n + "                 " + data + "\n";
           
          System.out.println(usuario);
          System.out.println(quiz);
          System.out.println(n);
          System.out.println(data);
          
        }
        return retorno;
        
        
    }
    //Gerar historico de determinado usuario
    public void gerarHistUser(String user) throws FileNotFoundException{
        
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

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getQuiz() {
        return quiz;
    }

    public float getNota() {
        return nota;
    }

    public String getData() {
        return data;
    }

    public historicoBuilder Usuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public historicoBuilder Quiz(String quiz) {
        this.quiz = quiz;
        return this;
    }

    public historicoBuilder Nota(float nota) {
        this.nota = nota;
        return this;
    }

    public historicoBuilder Data(String data) {
        this.data = data;
        return this;
    }
    
    public Historico build(){
        
        return new Historico(this);
    }
    
    public String pegarData() throws ParseException{
        String novaData = null;
        
        /*Date dataN = new Date(System.currentTimeMillis());
        SimpleDateFormat in= new SimpleDateFormat("yyyy-MM-dd"); 
        System.out.println(in);
        SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");  
        
        novaData = out.format(in.parse(dataN.toString())); */
        
        novaData = new SimpleDateFormat("dd/MM/yyyy").format(new Date()).toString();
        
        
        /*GregorianCalendar atual=(GregorianCalendar) GregorianCalendar.getInstance();  
        int mes = GregorianCalendar.MONTH;
        novaData="Data:" +atual.get(GregorianCalendar.DATE)+"/"+(atual.get((mes))+"/"+(atual.get(GregorianCalendar.YEAR))); 
        */
        System.out.println(novaData);
        return novaData;
    }
}
