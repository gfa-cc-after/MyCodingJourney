import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void drawImage (Graphics graphics) {
        drawSquare(50, 50, graphics);  // Draw a square at (50, 50)
        drawSquare(150, 100, graphics); // Draw a square at (150, 100)
        drawSquare (250, 200, graphics); // Draw a square at (250, 200)
    }

    // Function to draw a 50x50 square from the specified top-left corner
    private static void drawSquare(int x, int y, Graphics graphics) {
        graphics.drawRect(  x, y, 50, 50);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}
