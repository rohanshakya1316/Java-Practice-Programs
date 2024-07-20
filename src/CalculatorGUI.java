import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    private JTextField number1Field;
    private JTextField number2Field;
    private JButton addButton;
    private JButton subtractButton;

    public CalculatorGUI() {
        createView();

        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JLabel number1Label = new JLabel("Number 1:");
        panel.add(number1Label);

        number1Field = new JTextField(10);
        panel.add(number1Field);

        JLabel number2Label = new JLabel("Number 2:");
        panel.add(number2Label);

        number2Field = new JTextField(10);
        panel.add(number2Field);

        addButton = new JButton("Add");
        addButton.addActionListener(new ButtonClickListener());
        panel.add(addButton);

        subtractButton = new JButton("Subtract");
        subtractButton.addActionListener(new ButtonClickListener());
        panel.add(subtractButton);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double number1 = Double.parseDouble(number1Field.getText());
                double number2 = Double.parseDouble(number2Field.getText());

                if (e.getSource() == addButton) {
                    double sum = number1 + number2;
                    JOptionPane.showMessageDialog(CalculatorGUI.this, "Sum: " + sum);
                } else if (e.getSource() == subtractButton) {
                    double difference = number1 - number2;
                    JOptionPane.showMessageDialog(CalculatorGUI.this, "Difference: " + difference);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(CalculatorGUI.this, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }
}
