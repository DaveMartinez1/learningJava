import javax.swing.*;

public class Formulario extends JFrame{
   private JLabel labelOne;
   
    
   // Etiqueta que mostrara el mensaje en la IG(interfaz grafica)
   public Formulario(){
    setLayout(null);
    labelOne = new JLabel("Interfaz Grafica");
    labelOne.setBounds(10,20,200,300); // X,Y,Width,Height
    add(labelOne);
   }
    
   public static void main(String[] args){
       Formulario formOne = new Formulario();
       formOne.setBounds(0,0,400,400);
       formOne.setVisible(true);
       formOne.setLocationRelativeTo(null);
   }
}
