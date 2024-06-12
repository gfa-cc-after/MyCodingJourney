import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {
    public static void drawImage(Graphics graphics) {
        int squareSize = 100;

        // Define rainbow colors
        Color[] rainbowColors = {
                Color.BLUE, Color.GREEN, Color.ORANGE,
                Color.YELLOW, Color.RED, new Color(75, 0, 130), Color.MAGENTA
        };

        // Loop through rainbow colors and draw rainbow-colored squares
        for (int i = 0; i < rainbowColors.length; i++) {
            drawRainbowBox(squareSize, rainbowColors[i], graphics);
            squareSize -= 5; // Decrease square size for each iteration
        }
    }

    // Function to draw a rainbow-colored square at the center of the canvas
    private static void drawRainbowBox(int size, Color color, Graphics graphics) {
        int x = (WIDTH - size) / 2;
        int y = (HEIGHT - size) / 2;

        graphics.setColor(color);
        graphics.fillRect(x, y, size, size);
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
