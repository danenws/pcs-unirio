/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gabriel Ramos
 */
public class QuizBuilder {
    String r1;
    String c1;
    String r2;
    String c2;
    String r3;
    String c3;
    String r4;
    String c4;
    String r5;
    String c5;
 
    public QuizBuilder( String r1, String c1, String r2, String c2, String r3, String c3, String r4, String c4, String r5, String c5) {
        this.r1 = r1;
        this.c1 = c1;
        this.r2 = r2;
        this.c2 = c2;
        this.r3 = r3;
        this.c3 = c3;
        this.r4 = r4;
        this.c4 = c4;
        this.r5 = r5;
        this.c5 = c5;
    }
    

    public Quiz build() {
            return new Quiz(this);
    }
    
    public String exibirQuiz(String arquivo) throws FileNotFoundException{        
        String flagDica = null; 
        try{
            Scanner scanner = new Scanner(new FileReader(arquivo)).useDelimiter("\\*");
            flagDica=scanner.next(); 
            return flagDica;  
            }catch (FileNotFoundException ex) { // trata as exceções do tipo FileNotFoundException   
            ex.printStackTrace();  
        } catch (IOException ex) { // trata as exceções do tipo IOException   
            ex.printStackTrace();  
        } 
        return flagDica;  
    }
        

}
