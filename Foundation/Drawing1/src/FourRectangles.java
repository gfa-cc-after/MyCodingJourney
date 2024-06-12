import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void drawImage(Graphics graphics) {
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int width = random.nextInt(50) + 20;  // Random width between 20 and 70
            int height = random.nextInt(50) + 20; // Random height between 20 and 70
            int x = random.nextInt(WIDTH - width); // Random x-coordinate within the canvas width
            int y = random.nextInt(HEIGHT - height); // Random y-coordinate within the canvas height

            // Generate a random color
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            graphics.setColor(randomColor);


            // Draw the rectangle
            graphics.fillRect(x, y, width, height);
        }


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