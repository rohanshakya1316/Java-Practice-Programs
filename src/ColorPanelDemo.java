import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ColorPanelDemo {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Color Change Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create the panel
        JPanel colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);  // Original color

        // Add mouse listener to handle the color changes
        colorPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                colorPanel.setBackground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                colorPanel.setBackground(Color.BLUE);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                colorPanel.setBackground(Color.GREEN);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                colorPanel.setBackground(Color.WHITE);  // Revert to original color
            }
        });

        // Add the panel to the frame
        frame.add(colorPanel);
        frame.setVisible(true);
    }
}



//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class ColorPanelDemo  extends JFrame {
//
//    public ColorPanelDemo(){
//        // Create the ColorPanel
//        JPanel colorPanel = new JPanel();
//
//        // Set initial background color
//        Color originalColor = colorPanel.getBackground();
//
//        // Add mouse listener to the ColorPanel
//        colorPanel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                colorPanel.setBackground(Color.RED);
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                colorPanel.setBackground(Color.BLUE);
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                colorPanel.setBackground(Color.GREEN);
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e){
//                colorPanel.setBackground(originalColor);
//            }
//        });
//
//        // Add the colorPanel to the frame
//        add(colorPanel);
//
//        // Set frame properties
//        setTitle("Color Panel Demo");
//        setSize(400, 400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//    }
//
//    public static void main(String[] args) {
//        // Create and display the GUI
//        SwingUtilities.invokeLater(()->{
//            ColorPanelDemo frame = new ColorPanelDemo();
//            frame.setVisible(true);
//        });
//    }
//}
//
//
