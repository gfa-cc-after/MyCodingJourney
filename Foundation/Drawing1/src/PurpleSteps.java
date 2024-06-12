import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void drawImage(Graphics graphics) {
        int size = 20; // Size of each purple square
        int steps = 19; // Number of steps

        for (int i = 0; i < steps; i++) {
            drawPurpleSquare(i * size, size, graphics);
        }
    }

    // Function to draw a purple square at the specified coordinates
    private static void drawPurpleSquare(int x, int size, Graphics graphics) {
        graphics.setColor(new Color(128, 0, 128)); // Purple color
        graphics.fillRect(x, x, size, size);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(x, x, size, size);
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
