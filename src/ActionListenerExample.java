import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.awt.*;

public class ActionListenerExample extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton btn1, btn2;

    public ActionListenerExample() {
        setBounds(0,0,300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        l1 = new JLabel("Enter first number: ");
        l2 = new JLabel("Enter second number: ");
        l3 = new JLabel("Result: ");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        btn1 = new JButton("Sum");
        btn1.setFocusable(false);
        btn1.addActionListener(this);

        btn2 = new JButton("Difference");
        btn2.addActionListener(this);


        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(btn1);
        add(btn2);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int num1, num2, result; 
        num1 = Integer.parseInt(t1.getText());
        num2 = Integer.parseInt(t2.getText());
        if (e.getActionCommand() == "Sum") {
            result = num1 + num2;
            t3.setText(String.valueOf(result));        
        }
        else {
            result = num1 - num2;
            t3.setText(Integer.toString(result));

        }
        
    }

    public static void main(String[] args) {
        new ActionListenerExample();
    }
}