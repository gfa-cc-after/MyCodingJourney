import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void drawImage(Graphics graphics) {
        // Set the background color to black
        graphics.setColor(new Color(11, 30, 56)); // ACTUALL VAN GOG COLOR dark blue
        graphics.fillRect(0, 0, WIDTH, HEIGHT);

        // Draw random stars
        drawStars(graphics, 11111);  // You can adjust the number of stars as needed
    }

    private static void drawStars(Graphics graphics, int numStars) {
        Random random = new Random();

        for (int i = 0; i < numStars; i++) {
            // Generate random positions for stars
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);

            // Generate a random shade of grey for the star color
            int greyShade = random.nextInt(256);
            Color starColor = new Color(greyShade, greyShade, greyShade);

            // Draw a small square as the star
            graphics.setColor(starColor);
            graphics.fillRect(x, y, 2, 2);  // Adjust the size of the star as needed
        }
    }

    // Don't touch the code below
    static int WIDTH = 800;  // Adjusted width for a larger canvas
    static int HEIGHT = 600;  // Adjusted height for a larger canvas

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Starry Night");
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
