import javax.swing.*;

public class ScrollBar extends JFrame {
    private JTextField textField;
    private JScrollPane scrollPane;
    private JTextArea textArea;

    public ScrollBar() {
        setLayout(null);
        textField = new JTextField();
        textField.setBounds(10, 10, 200, 30);
        add(textField);

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 50, 400, 300);
        add(scrollPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ScrollBar window = new ScrollBar();
            window.setBounds(0, 0, 540, 400);
            window.setVisible(true);
            window.setResizable(false);
            window.setLocationRelativeTo(null);
        });
    }
}