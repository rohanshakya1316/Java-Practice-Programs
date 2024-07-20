import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TextAreaExample extends JFrame implements ActionListener{
    JTextArea area = new JTextArea();
    JButton button = new JButton("Submit");
    public TextAreaExample() {
        setBounds(0, 0, 500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        area.setBounds(20, 20, 400, 200);
        area.setBackground(Color.WHITE);
        area.setForeground(Color.green);


        button.setBounds(330,250,100, 30);
        button.setBackground(Color.green);
        button.setBorder(null);
        button.setFocusable(false);
        button.addActionListener(this);
        add(button);

        add(area);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
       // System.out.println(area.getText());
        if (e.getSource() == button) {
            System.out.println(area.getText());
        }
    }

    public static void main(String [] args) {
        new TextAreaExample();
    }
}
