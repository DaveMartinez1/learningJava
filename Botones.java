import javax.swing.*;
import java.awt.event.*;

public class Botones extends JFrame implements ActionListener{
    
    private JButton buttonOne;
    
    public Botones(){
        setLayout(null);
        buttonOne = new JButton("Cerrar");
        buttonOne.setBounds(300,250,100,30);
        add(buttonOne);
        buttonOne.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == buttonOne){ // getSource contiene el objeto donde se origino el evento
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        Botones buttons = new Botones();
        buttons.setBounds(0,0,450,350);
        buttons.setVisible(true);
        buttons.setResizable(false);
        buttons.setLocationRelativeTo(null);
    }
}