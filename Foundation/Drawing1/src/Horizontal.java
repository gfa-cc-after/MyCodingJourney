import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {
    public static void drawImage(Graphics graphics) {
        // Draw at least 3 lines using a loop  3 lebo i<3...
        for (int i = 0; i < 3; i++) {
            // Generate random starting point coordinates
            int x = (int) (Math.random() * WIDTH);
            int y = (int) (Math.random() * HEIGHT);

            drawHorizontalLine(x, y, graphics);
        }
    }
    // I have no idea what im doing but its supposed to be random<<?
    // Function to draw a 50-pixel long horizontal line from a point
    private static void drawHorizontalLine(int x, int y, Graphics graphics) {
        // Draw a 50-pixel long horizontal line from the specified point
        graphics.drawLine(x, y, x + 50, y);
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