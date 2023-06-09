import javax.swing.*;
import java.awt.event.*;

public class ComponentesComb extends JFrame implements ActionListener{
    
    private JButton bOne, bTwo, bThree; // b = button
    private JLabel lOne; // l = label
    
    public ComponentesComb(){
        setLayout(null);
        bOne = new JButton("1");
        bOne.setBounds(10,100,90,30);
        add(bOne);
        bOne.addActionListener(this);
        
        bTwo = new JButton("2");
        bTwo.setBounds(110,100,90,30);
        add(bTwo);
        bTwo.addActionListener(this);
        
        bThree = new JButton("3");
        bThree.setBounds(210,100,90,30);
        add(bThree);
        bThree.addActionListener(this);
        
        lOne = new JLabel("En espera...");
        lOne.setBounds(10,10,300,30);
        add(lOne);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == bOne){
            lOne.setText("Hello World");
        } else if (e.getSource() == bTwo){
            lOne.setText("We Are Legion");
        } else if (e.getSource() == bThree){
            lOne.setText("Bye World");
        }
    }
    
    public static void main(String[] args){
        ComponentesComb formOne = new ComponentesComb();
        formOne.setBounds(0,0,500,500);
        formOne.setVisible(true);
        formOne.setResizable(false);
        formOne.setLocationRelativeTo(null);
    }
    
}