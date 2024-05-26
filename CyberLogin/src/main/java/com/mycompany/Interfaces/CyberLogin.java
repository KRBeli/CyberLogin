package com.mycompany.Interfaces;

/**
 * Classe responsável por iniciar a aplicação CyberLogin.
 */

public class CyberLogin {
//teste
    public static void main(String[] args) {
               /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new CyberLoginTela().setVisible(true);
            }
        });
    }
}