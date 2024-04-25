package com.mycompany.cyberlogin;

public class CyberLogin {

    public static void main(String[] args) {
               /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new CyberLoginTela().setVisible(true);
                
                
            }
        });
    }
}