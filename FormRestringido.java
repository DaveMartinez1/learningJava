import javax.swing.*;

public class FormRestringido extends JFrame{
    
    public FormRestringido(){
        setLayout(null);
    }
    
    public static void main(String[] args){
        FormRestringido formOne = new FormRestringido();
        formOne.setBounds(0,0,500,500); // Ajustar posicion y tamaño de la IG
        formOne.setVisible(true);
        formOne.setLocationRelativeTo(null);
        formOne.setResizable(false);
    }
}