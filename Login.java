import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    private JLabel labelOne,labelTwo,labelThree;
    private JTextField userField,passField;
    private JButton loginButton;
    
    public Login(){
        setLayout(null);
        labelOne = new JLabel("Username:");
        labelOne.setBounds(10,10,100,30);
        add(labelOne);
        
        labelTwo = new JLabel("Password:");
        labelTwo.setBounds(10,50,100,30);
        add(labelTwo);
        
        labelThree = new JLabel();
        labelThree.setBounds(140,80,100,30);
        add(labelThree);
        
        userField = new JTextField();
	userField.setBounds(75,15,150,20);
        add(userField);
        
        passField = new JTextField();
	passField.setBounds(75,56,150,20);
        add(passField);
        
        loginButton = new JButton("Login");
        loginButton.setBounds(10,80,100,30);
        add(loginButton);
        loginButton.addActionListener(this);
        
        setTitle("Lexa Control Panel");
    }
    
    public void actionPerformed(ActionEvent e){
        String usernameDb = "lexa",passwordDb = "sysadmin123";
        if (e.getSource() == loginButton){
            if (userField.getText() == usernameDb || passField.getText() == passwordDb){
                labelThree.setText("Acceso exitoso!");
            } else{
                labelThree.setText("Datos inválidos");
            }
        }
    }
    
    public static void main(String[] args){
        Login window = new Login();
        window.setBounds(0,0,270,165);
        window.setVisible(true);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
    }
}