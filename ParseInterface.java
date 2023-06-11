import javax.swing.*;
import java.awt.event.*;
public class ParseInterface extends JFrame implements ActionListener{
    private JTextField textFieldOne,textFieldTwo;
    private JLabel labelOne,labelTwo,labelThree;
    private JButton buttonOne;

    public ParseInterface(){
        setLayout(null);
        labelOne = new JLabel("Valor 1:");
        labelOne.setBounds(50,5,100,30);
        add(labelOne);

        labelTwo = new JLabel("Valor 1:");
        labelTwo.setBounds(50,35,100,30);
        add(labelTwo);

        labelThree = new JLabel("Resultado:");
        labelThree.setBounds(120,80,100,30);
        add(labelThree);

        textFieldOne = new JTextField();
        textFieldOne.setBounds(120,10,150,20);
        add(textFieldOne);

        textFieldTwo = new JTextField();
        textFieldTwo.setBounds(120,40,150,20);
        add(textFieldTwo);

        buttonOne = new JButton("sumar");
        buttonOne.setBounds(10,80,100,30);
        add(buttonOne);
        buttonOne.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonOne){
            int numOne = 0, numTwo = 0, resultado = 0;

            numOne = Integer.parseInt(textFieldOne.getText());
            numTwo = Integer.parseInt(textFieldTwo.getText());

            resultado = numOne+numTwo;

            labelThree.setText("Resultado: " + resultado);
        }
    }

    public static void main(String[] args) {
        ParseInterface window = new ParseInterface();
        window.setBounds(0,0,300,150);
        window.setVisible(true);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
    }
}
