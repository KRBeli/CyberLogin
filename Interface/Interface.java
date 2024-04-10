package Interface;
import javax.swing.JFrame;
//Conceito de Herança aplicado "extends"
public class Interface extends JFrame{
    //Construtor
    public Interface(){
        setTitle("CyberLogin");
        setSize(500, 500);
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);   
         setVisible(true);         
    }
    
}