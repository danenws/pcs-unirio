/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contos;

import Dicas.ThePot;
import Quiz.ThePoty;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pcs.Conto;
import pcs.contoBuilder;

/**
 *
 * @author felipequintanilha
 */
public class Twopots extends javax.swing.JFrame {

    /**
     * Creates new form Twopots
     */
    
    private int cont=0;
    public int dica=0;
    String nomeUsuario;
    String titulo;
    
    
    public Twopots() {
       // initComponents();
        initComponents();
        this.setSize(750, 450);
        this.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    public Twopots(String nome) {
        nomeUsuario = nome;
        initComponents();
        this.setSize(750, 450);
        this.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextPane1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextPane1PropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(70, 50, 630, 160);

        jButton1.setText("Avançar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(640, 350, 90, 40);

        jButton3.setBackground(new java.awt.Color(200, 218, 235));
        jButton3.setText("Dica");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(590, 210, 110, 30);

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(650, 400, 73, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contos/twopots.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 0, 730, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextPane1PropertyChange
        // TODO add your handling code here:

        contoBuilder c = new contoBuilder();
       
        jTextPane1.setText(c.lerContoPos(0, "contos/capitulo1/tepatbp.txt"));
        Font font = new Font("Serif", Font.ITALIC, 20);
        jTextPane1.setFont(font);

    }//GEN-LAST:event_jTextPane1PropertyChange

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        contoBuilder c = new contoBuilder();
        
        String [] x;
        x = c.lerConto("contos/capitulo1/tepatbp.txt"); //Lê o conteúdo do conto em um arquivo e armazena no vetor x
       
        int tam = 0; 
        try {
            tam = c.tamanhoConto("contos/capitulo1/tepatbp.txt"); //Pega o tamanho do vetor do conteúdo do conto
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Twopots.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(tam);
        
        if(cont<tam-1){
             if (cont==2){
             if (dica== 1){
                 cont++;
            jTextPane1.setText(x[cont]);

            /*System.out.print("Cont e: ");
            System.out.print(cont);
            System.out.println("");*/
             } else {
             JOptionPane.showMessageDialog(null, "Você tem uma dica te esperando!!");
             }}
              else {
            cont++;
            jTextPane1.setText(x[cont]);

            /*System.out.print("Cont e: ");
            System.out.print(cont);
            System.out.println("");*/
             
        }}else{
        
            System.out.println("Acabou :(");
            ThePoty quiz = new ThePoty();
            quiz.setVisible(true);
            this.dispose();
        }
        

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Quando clicar no botão avançar, atualizar o campo de texto:

        /*Conto c = new Conto(); //Cria um objeto do tipo conto

        String [] x;
        x = c.lerConto("contos/capitulo1/tepatbp.txt"); //Lê o conteúdo do conto em um arquivo e armazena no vetor x

        //int tam=0;

        jTextPane1.setText(x[cont]);
        cont= cont++;
        System.out.print("Cont e: ");
        System.out.print(cont);
        System.out.println("");*/

        // tam = c.tamanhoConto("contos/capitulo1/tepatbp.txt");

        //jTextPane1.setText(c.lerContoPos(++cont, "contos/capitulo1/tepatbp.txt"));

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ThePot conto2 = new ThePot();
        conto2.setVisible(true);
        dica=1;

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Sai do conto

        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Twopots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Twopots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Twopots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Twopots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Twopots().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
