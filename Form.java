import javax.swing.*;

public class Form extends JFrame{
    
    private JLabel labelOne;
    private JLabel labelTwo;
    
    public Form(){
        setLayout(null);
        labelOne = new JLabel("Ximena Martinez");
        labelOne.setBounds(10,20,300,30); // X,Y,Anchura,Altura
        add(labelOne);
        labelTwo = new JLabel("Version 1.0");
        labelTwo.setBounds(10,170,100,30);
        add(labelTwo);
    }
    
    public static void main(String[] args){
        Form formOne = new Form();
        formOne.setBounds(0,0,300,200);
        formOne.setResizable(false); // No redimencionar la interfaz grafica
        formOne.setVisible(true);
        formOne.setLocationRelativeTo(null);
    }
}