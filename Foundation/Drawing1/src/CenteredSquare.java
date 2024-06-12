import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

    public static void drawImage(Graphics graphics) {
        // Calculate the coordinates to center the square
        int squareSize = 10;
        int x = (WIDTH - squareSize) / 2;
        int y = (HEIGHT - squareSize) / 2;

        // Draw a green 10x10 square to the canvas' center
        graphics.setColor(Color.BLACK);
        graphics.fillRect(x, y, squareSize, squareSize);
        graphics.setColor(new Color(11, 30, 56));
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