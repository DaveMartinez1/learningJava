import javax.swing.*;
import java.awt.event.*;

public class LoginIg extends JFrame implements ActionListener{
	
	private JTextField textFieldOne;
	private JLabel labelOne;
	private JButton buttonOne;
	
	public LoginIg(){
		setLayout(null);
		labelOne = new JLabel("Username:");
		labelOne.setBounds(10,10,100,30);
		add(labelOne);

		textFieldOne = new JTextField();
		textFieldOne.setBounds(120,17,150,20);
		add(textFieldOne);
		
		buttonOne = new JButton("Ingresar");
		buttonOne.setBounds(10,80,100,30);
		add(buttonOne);
		buttonOne.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == buttonOne){
			String text = textFieldOne.getText();
			setTitle(text);
		}
	}
	
	public static void main(String[] args){
		LoginIg window = new LoginIg();
		window.setBounds(0,0,500,300);
		window.setVisible(true);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
	}
}