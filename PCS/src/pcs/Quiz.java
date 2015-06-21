/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Ramos
 */

package pcs;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.Scanner;


public class Quiz {

    public Quiz( String r1, String c1, String r2, String c2, String r3, String c3, String r4, String c4, String r5, String c5) {
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
    
    private String pergunta;
    private String r1;
    private String c1;
   private String r2;
    private String c2;
        private String r3;
    private String c3;
    private String r4;
    private String c4;
        private String r5;
    private String c5;
    
    public Quiz(String pergunta, String reporsta) {
        this.pergunta = pergunta;
        this.reporsta = reporsta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public void setReporsta(String reporsta) {
        this.reporsta = reporsta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String getReporsta() {
        return reporsta;
    }
    private String reporsta;

    public int Corrigir(){
    int nota = 0;
    if (r1.equals(c1)){
        nota = nota + 20;
    }
       if (r2.equals(c2)){
        nota = nota + 20;
    }
       if (r3.equals(c3)){
        nota = nota + 20;
    }
       if (r4.equals(c4)){
        nota = nota + 20;
    }
       if (r5.equals(c5)){
        nota = nota + 20;
    }
    return nota;
    }

    public boolean q1(){
    if (r1.equals(c1)){
    return true;      
    }
    return false;
}
    public boolean q2(){
    if (r2.equals(c2)){
    return true;      
    }
    return false;
}
    public boolean q3(){
    if (r3.equals(c3)){
    return true;      
    }
    return false;
}
    public boolean q4(){
    if (r4.equals(c4)){
    return true;      
    }
    return false;
}
    public boolean q5(){
    if (r5.equals(c5)){
    return true;      
    }
    return false;
}
    
    
}
