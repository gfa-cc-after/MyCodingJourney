import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void drawImage(Graphics graphics) {
        // Draw the canvas' diagonals
        drawDiagonal(0, 0, WIDTH, HEIGHT, Color.BLACK, graphics);
        drawDiagonal(WIDTH, 0, 0, HEIGHT, Color.BLUE, graphics);
    }

    // Function to draw a diagonal line from a starting point to an ending point with a specified color
    public static void drawDiagonal(int x1, int y1, int x2, int y2, Color color, Graphics graphics) {
        graphics.setColor(color);  // Set the color
        graphics.drawLine(x1, y1, x2, y2);  // Draw the line
    }



    // im not supposed to know this belowwwwwwwwwww
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