import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExerciseOne extends JFrame implements ActionListener {
    private JTextField textField;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    private JButton button;
    
    String text = "";
    
    public ExerciseOne(){
        setLayout(null);
        textField = new JTextField();
        textField.setBounds(10,10,200,30);
        add(textField);

        button = new JButton("Agregar");
        button.setBounds(250,10,100,30);
        add(button);
        button.addActionListener(this);

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10,50,400,300);
        add(scrollPane);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            text += textField.getText() + "\n";
            textArea.setText(text);
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        ExerciseOne window = new ExerciseOne();
        window.setBounds(0,0,540,400);
        window.setVisible(true);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
    }
}