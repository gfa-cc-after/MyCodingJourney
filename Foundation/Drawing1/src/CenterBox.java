import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBox {

    public static void drawImage(Graphics graphics) {
        drawSquare(50, graphics);  // Draw a square of size 50
        drawSquare(100, graphics); // Draw a square of size 100
        drawSquare(150, graphics); // Draw a square of size 150
        graphics.setColor(Color.RED);

    }

    // Function to draw a square of the specified size at the center of the canvas
    private static void drawSquare(int size, Graphics graphics) {
        int x = (WIDTH - size) / 2;
        int y = (HEIGHT - size) / 2;
        graphics.drawRect(x, y, size, size);

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
