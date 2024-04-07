package Interface;
import javax.swing.JFrame;

public class Interface {
    //Construtor
    public Interface(){
        JFrame jFrame = new JFrame("Tela de Login");
        jFrame.setVisible(true);
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null); 
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            
    }
    
}