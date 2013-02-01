/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Carlos
 */
    public class Teste1 extends javax.swing.JFrame {  
      
      
        public Teste1() {  
            initComponents();  
        }  
      
        private void initComponents() {  
            jPanel1 = new javax.swing.JPanel();  
            jComboBox1 = new javax.swing.JComboBox();  
      
              jComboBox1.setPreferredSize(new java.awt.Dimension(150, 25));  
      
             //jComboBox1.setEditable(true);  
      
      
            addWindowListener(new java.awt.event.WindowAdapter() {  
                public void windowClosing(java.awt.event.WindowEvent evt) {  
                    exitForm(evt);  
                }  
            });  
      
            jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {  
                public void keyPressed(java.awt.event.KeyEvent evt) {  
                    jComboBox1KeyPressed(evt);  
                }  
            });  
      
            jPanel1.add(jComboBox1);  
      
            getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);  
      
            setSize(500,450);  
        }  
      
        private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {  
             
            javax.swing.JOptionPane.showMessageDialog(null,"Opa Funfa !!");  
        }  
      
         
        private void exitForm(java.awt.event.WindowEvent evt) {  
            System.exit(0);  
        }  
      
          
        public static void main(String args[]) {  
            new Teste1().show();  
        }  
      
      
        
        private javax.swing.JPanel jPanel1;  
        private javax.swing.JComboBox jComboBox1;  
         
      
    }  
