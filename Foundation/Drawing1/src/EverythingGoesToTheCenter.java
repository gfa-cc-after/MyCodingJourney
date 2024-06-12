import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
// no clue googled all
public class EverythingGoesToTheCenter {
    public static void drawImage(Graphics graphics) {
        // Draw lines from the edges to the center - loop 2x
        for (int i = 0; i <= WIDTH; i += 20) {
            drawLineToCenter(i, 0, graphics);            // Top edge
            drawLineToCenter(i, HEIGHT, graphics);       // Bottom edge
        }
        for (int i = 0; i <= HEIGHT; i += 20) {
            drawLineToCenter(0, i, graphics);            // Left edge
            drawLineToCenter(WIDTH, i, graphics);        // Right edge
        }
    }

    // Function to draw a line from the specified point to the center
    private static void drawLineToCenter(int x, int y, Graphics graphics) {
        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;
        graphics.drawLine(x, y, centerX, centerY);
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
