import javax.swing.*;

public class TextArea extends JFrame{
    
    private JTextField textField;
    private JTextArea textArea;

    public TextArea(){
        setLayout(null);
        textField = new JTextField();
        textField.setBounds(10,10,200,30);
        add(textField);

        textArea = new JTextArea();
        textArea.setBounds(10,50,400,300);
        add(textArea);
    }

    public static void main(String[] args){
        TextArea window = new TextArea();
        window.setBounds(0,0,540,400);
        window.setVisible(true);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
    }
}