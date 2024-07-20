import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyListenerExample extends JFrame implements KeyListener{
    JLabel label = new JLabel();
    public KeyListenerExample() {
        setBounds(0, 0, 550, 530);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        add(label);
        addKeyListener(this);
        setVisible(true);
    }
    public void keyTyped(KeyEvent e){
     //   System.out.println(e.getKeyChar()); // getKeyChar lies in KeyEvent.
        switch (e.getKeyChar()) {
            case 'a' :label.setLocation(label.getX()-10, label.getY());
                break;
            case 'w' :label.setLocation(label.getX(), label.getY()-10);
                break;
            case 's' :label.setLocation(label.getX(), label.getY()+10);
                break;
            case 'd' :label.setLocation(label.getX()+10, label.getY());
                break;
        }
    }

    public void keyPressed(KeyEvent e){
      //  System.out.println("Key is pressed!!");
        System.out.println(e.getKeyCode());
        System.out.println(e.getKeyChar());
    }

    public void keyReleased(KeyEvent e){
        //System.out.println("Key is released!!");
    }
    public static void main (String [] args) {

        new KeyListenerExample();
    }
}
