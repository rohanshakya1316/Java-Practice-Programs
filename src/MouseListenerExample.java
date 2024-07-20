import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample   extends JFrame implements MouseListener {
    JLabel label = new JLabel();

    public MouseListenerExample() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        //ImageIcon = new ImageIcon("image.jpg");

        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.addMouseListener(this);
        add(label);
        setVisible(true);

    }

    public void mouseClicked(MouseEvent e) {
        // label.setBackground(Color.cyan);

    }

    public void mousePressed(MouseEvent e) {
        label.setBackground(Color.yellow);

    }

    public void mouseReleased(MouseEvent e) {
        label.setBackground(Color.green);

    }

    public void mouseEntered(MouseEvent e) {
        label.setBackground(Color.blue);

    }

    public void mouseExited(MouseEvent e) {
        label.setBackground(Color.red);

    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}